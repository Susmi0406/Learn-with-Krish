public class HealthChecker {
    private static volatile HealthChecker healthChecker ;

	private HealthChecker() {
		if(healthChecker != null) {
			throw new RuntimeException("please use getHealthChecker method");
			
		}
	}
	
	 public void print() {
	        System.out.println("Health Check");
	    }

	public static HealthChecker getHealthChecker() {
		
		if(healthChecker == null) {
			
			synchronized (HealthChecker.class) {
				if(healthChecker == null ) {
					
					healthChecker = new HealthChecker();
					
				}
			
			
			}
		}
			
		return healthChecker;
	}


    
}
