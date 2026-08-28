package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Profile;
import com.nt.entity.User;
import com.nt.repository.IUserRepository;

@Service
public class UserProfileMgmtService implements IUserProfileMgmtService {

    @Autowired
    private IUserRepository userRepo;

    @Override
    public void saveUser() {

        IO.println("Enter Username");
        String uname = IO.readln();

        IO.println("Enter Password");
        String pwd = IO.readln();

        IO.println("Enter Phone");
        String phone = IO.readln();

        IO.println("Enter Address");
        String address = IO.readln();

        Profile profile = new Profile(phone,address);

        User user = new User(uname,pwd,profile);

        userRepo.save(user);

        IO.println("User Saved Successfully");
    }

    @Override
    public void showUser(Integer id) {

        Optional<User> opt = userRepo.findById(id);

        if(opt.isPresent()) {

            User user = opt.get();

            IO.println("---------------------------");
            IO.println("User Id : "+user.getId());
            IO.println("Username : "+user.getUsername());
            IO.println("Password : "+user.getPassword());

            IO.println("Phone : "+user.getProfile().getPhone());
            IO.println("Address : "+user.getProfile().getAddress());
            IO.println("---------------------------");

        }
        else {

            IO.println("User Not Found");
        }

    }

	@Override
	public void showAll() {
		userRepo.findAll().forEach(IO::println);
		
	}

}