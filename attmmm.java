import java.util.*;
class bk
{
          String un,pw,accnum,th="";
          float bal=0f;
          public void reg()
          {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter your un:");
                 this.un=sc.nextLine();
                 System.out.println("Enter your accnum:");
                 this.accnum=sc.nextLine();
                 System.out.println("Enter your pw:");
                 this.pw=sc.nextLine();
                 System.out.println("REGISTRATION IS SUCCESS");
           }
           public boolean log()
           {
                 Scanner sc = new Scanner(System.in);
                 boolean islog=false;
                 int count=0;
                 while(!islog)
                 {
                     System.out.println("Enter un: ");
                     String un1=sc.nextLine();
                     if(un1.equals(un))
                     {
                        System.out.println("Enter your pw: ");
                        String pw1=sc.nextLine();
                        if(pw1.equals(pw) && count<2)
                        {
                              System.out.println("successfully logged in....");
                              islog=true;
                        }
                        else if(count==2)
                        {
                              System.out.println("login attempts completed");
                              return islog;
                        }
                        else
                        {
                              System.out.println("please do try again!!incorrect pw");
                              count++;
                        }
                      }
                      else
                      {
                              System.out.println("User does not exists!");
                      }  
                 }
                 return islog;
           }
           public void dep()
           {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter amt to be dep: ");
                  float amt=sc.nextFloat();
                  try
                  {
                       bal=bal+amt;
                       System.out.println("amt deposited");
                       String s=" Dep amt "+amt+"\n";
                       th=th.concat(s); 
                  }    
                  catch(Exception e)
                  {

                  }
           }
           public void wdw()
           {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter amt to be wdw : ");
                  float amt=sc.nextFloat();
                  try
                  {
                        if(bal >= amt)
                        {
                          bal=bal-amt;
                          System.out.println("amt withdrawed");
                          String s=" Wdw amt "+amt+"\n";
                          th=th.concat(s);
                        }
                        else
                        {
                          System.out.println("bal not sufficient");
                        }
                  }
                  catch(Exception e)
                  {
                        
                  }
           }
           public void transf()
           {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter name of the receipent: ");
                  String rcpt =sc.nextLine();
                  System.out.println("Enter amt to transf :");
                  float amt=sc.nextFloat();
                  try
                  {
                        if(bal >= amt)
                        {
                           bal=bal-amt;
                           System.out.println("amt transf successfully");
                           String s=" Transf amt " + amt + " to " + rcpt + "\n";
                           th=th.concat(s);
                        }
                        else
                        {
                           System.out.println("bal not sufficient");
                        }   
                  }
                  catch(Exception e)
                  {
                        
                  }
           }
           public void checkbal()
           {
                  System.out.println("Bal:" + bal);
           }
           public void tH()
           {
                  if(th=="")
                  {
                        System.out.println("Emptyyyy");
                  }
                  else
                  {
                        System.out.println(th);
                  }
           }
}
class attmmm
{
           public static void main(String args [])
           {
                  bk b=new bk();
                  Scanner sc = new Scanner(System.in);
                  System.out.println("welcome");
                  System.out.println("Enter 1 for Reg ");
                  System.out.println("Enter 2 then exit");
                  int choice =sc.nextInt();
                  if(choice==1)
                  {
                       b.reg();
                       System.out.println("Enter 1 then do login ");
                       System.out.println("Enter 2 then exit");
                       choice=sc.nextInt();
                       if(choice ==1)
                       {
                            if(b.log())
                            {
                                 while(true)  
                                 {  
                                         System.out.println("ATM");  
                                         System.out.println("Choose 1 then do dep");  
                                         System.out.println("Choose 2 then Wdw");  
                                         System.out.println("Choose 3 then transf");
                                         System.out.println("Choose 4 then Check bal"); 
                                         System.out.println("Choose 5 then check Trans history");
                                         System.out.println("Choose 6 then go EXIT");  
                                         System.out.print("Choose an operation that you want:"); 
                                         choice=sc.nextInt();
                                         switch(choice)
                                         {
                                                   case 1:b.dep();
                                                   break;
                                                   case 2:b.wdw();
                                                   break;
                                                   case 3:b.transf();
                                                   break;
                                                   case 4:b.checkbal();
                                                   break;
                                                   case 5:b.tH();
                                                   break;
                                                   case 6:return;
                                         }
                                 }
                            }
                            else
                            {
                              System.out.println("failed to login");
                            }
                       }
                       else
                       {
                            return;
                       }
                  }
                  else
                  {
                        return;
                  }
           }
}
                  
