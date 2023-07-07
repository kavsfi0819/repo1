package Hybridinher;

public class sdlc {

		
			 public void displaysdlc() {
				 System.out.println("tommorrow is working day");
			 }
			 
		}
			 interface trainer{
					public void show();
				}
				interface receptist{
					public void show();
					
				}
				class student extends sdlc implements trainer,receptist{
					public void show() {
					System.out.println("implements both trainer and receptist");
					}

				public void display(){
					System.out.println("method inside student class");
					
		}
				public static void main(String args[]) {
					student obj = new student();
					System.out.println("implement hybrid and single in java");
					obj.show();
					obj.displaysdlc();
		}
				
		}

