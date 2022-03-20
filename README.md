package com.import com.jpa.test.entities.user;
@springBootapplication
public class BootjpaexampleApplication
{
public static void main(String[]args)
{
ApplicationContext context=springApplication.run(BootjpaexamleApplication.class,args);
UserRepository userRepository=Context.getBean(userRepository.class);
User user1=new User();
user1.setName=("Uttam");
user1.setCity=("city1");
usre1.setStatus=("python Programming");
User user2=new User();
user2.setName=("Ankit");
usre2.setCity("city");
user2.setStatus=("java programming");
//update the user of Id 11
optional<user>find ById=user Repository.findByIb(11);
Useruser=optinalget();
user.setName("Ankit Tiwari");
user.result=userRepository.save(user);
System.out.println(user);
//delete the User
userRepository.deleteBy(11);
System.out.println("Delete");
}
}
