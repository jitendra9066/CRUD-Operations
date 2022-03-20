import com.jpa.test.entities.user;
public class bootjpaApplication
{
public static void main(String[]args)
{
ApplicationContext context=new SpringApplication.run(BootjpaexampleApplication.class,args);
UserRepository userRepository=context.getbean(UserRepository.class);
//Create object of user
User user1=new User();
user1.setName=("Uttam");
user1.setcity=("city1");
user1.setstatus=("python");
User user2=new User();
user2.getName="ankit";
user2.getcity="city2";
user2.getstatus="java";
  //Single entity
UserResult user=UserRepository.save(user);
System.out.println("save user"+resultUser);
System.out.println("done");
  //Multiple entity
  iterable<user>result=userRepository.saveall(Users);
  result for each(user->{System.outprintln(user);});
  System.out.println("done");
  
}
}
