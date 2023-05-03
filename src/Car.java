import java.util.*;

	

// Implements comparable interface into custom class
class Car {
    String model,title,features,rating;
   
 
    // Parameterized constructor of the class
   public Car(String model, String title, String features, String rating)
    {
        this.model = model;
        this.title = title;
        this.features = features;
        this.rating = rating;
    }
   public String toString()
   {
	   return this.model + " " + this.title + " " + this.features + " " + this.rating;
   }

	
}

    class sortbymodel implements Comparator<Car> {
    	  
        // override the compare() method
        public int compare(Car s1, Car s2)
        {
            return s1.model.compareTo(s2.model);
      
       
          
			}
        
        
    }

  


	

	
