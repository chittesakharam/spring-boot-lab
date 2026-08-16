package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.GymMember;
import com.nt.services.IGymMemberService;

@Component
public class GymMemberRunner implements CommandLineRunner {

	@Autowired
	private IGymMemberService service;

	@Override
	public void run(String... args) throws Exception {

		String menu = """
				========== Gym Member Management ==========
				1. Register New Member
				2. Register Multiple Members
				3. View All Members
				4. Search Member Details
				5. Check Member Availability
				6. View Total Registered Members
				7. Update Membership Fees
				8. Delete Member by ID
				9. Delete All Members
				0. Exit
				===========================================
				""";

		do {
			IO.println(menu);

			int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));

			switch (choice) {

			case 1 -> {
				long id = Long.parseLong(IO.readln("Enter Member Id : "));
				String name = IO.readln("Enter Member Name : ");
				String type = IO.readln("Enter Membership Type : ");
				int duration = Integer.parseInt(IO.readln("Enter Membership Duration (Months) : "));
				double fees = Double.parseDouble(IO.readln("Enter Membership Fees : "));

				String result = service.addMember(
						new GymMember(id, name, type, duration, fees));

				IO.println(result);
			}

			case 2 -> {
				int n = Integer.parseInt(IO.readln("Enter No Of Members : "));
				List<GymMember> list = new ArrayList<>();

				for (int i = 0; i < n; i++) {

					long id = Long.parseLong(IO.readln("Enter Member Id : "));
					String name = IO.readln("Enter Member Name : ");
					String type = IO.readln("Enter Membership Type : ");
					int duration = Integer.parseInt(IO.readln("Enter Membership Duration (Months) : "));
					double fees = Double.parseDouble(IO.readln("Enter Membership Fees : "));

					list.add(new GymMember(id, name, type, duration, fees));
				}

				String result = service.addAllMembers(list);
				IO.println(result);
			}

			case 3 -> service.getAllMembers().forEach(IO::println);

			case 4 -> {
				long id = Long.parseLong(IO.readln("Enter Member Id : "));
				GymMember member = service.getMemberById(id);
				IO.println(member);
			}

			case 5 -> {
				long id = Long.parseLong(IO.readln("Enter Member Id : "));
				Boolean exists = service.memberExists(id);
				IO.println(exists ? "Member Available" : "Member Not Available");
			}

			case 6 -> IO.println(service.totalMembers() + " Total Members Registered");

			case 7 -> {
				long id = Long.parseLong(IO.readln("Enter Member Id : "));
				double fees = Double.parseDouble(IO.readln("Enter New Membership Fees : "));

				String result = service.updateMember(id, fees);
				IO.println(result);
			}

			case 8 -> {
				long id = Long.parseLong(IO.readln("Enter Member Id : "));
				String result = service.removeMember(id);
				IO.println(result);
			}

			case 9 -> {
				String result = service.removeAllMembers();
				IO.println(result);
			}

			case 0 -> System.exit(0);

			default -> IO.println("Invalid Choice... Please Try Again!");
			}

		} while (true);
	}
}