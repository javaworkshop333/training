package javaTutorial.chapter7;

public class DogInit {
		String name,breed;
		
		public DogInit()
		{  
			name="moti";
			breed="mixed";
		}
		
		public DogInit(String dogName)
		{  
			name=dogName;  
		}
		public DogInit(String dogName,String dogBreed)
		{  
			name=dogName;  
			breed=dogBreed;  
		}
		public void bark()
		{ 
			System.out.println("dog breed - "+breed+" named "+name+" is barking");
		}
		public void eat()
		{ 
			System.out.println("dog breed - "+breed+" named "+name+" is eating");
		}
		
}
