public class Application {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setId("Emp004");
        emp1.setCode("E004VPE");
        emp1.setName("Sushmi");
        emp1.setNic("978965452V");
        emp1.setAddress("Mannar");

        Employee emp2 = new Employee();

        emp2.setId("Emp012");
        emp2.setCode("E012VPE");
        emp2.setName("Neo");
        emp2.setNic("968455422V");
        emp2.setAddress("Kandy");


        Employee emp3 = new Employee();

        emp3.setId("Emp012");
        emp3.setCode("E012VPE");
        emp3.setName("Neo");
        emp3.setNic("968455422V");
        emp3.setAddress("Kandy");

        System.out.println("Employee-01's Details");
        System.out.println("ID : " + emp1.getId());
        System.out.println("Code :" + emp1.getCode());
        System.out.println("Name : " + emp1.getName());
        System.out.println("NIC : " + emp1.getNic());
        System.out.println("Address : " + emp1.getAddress());

        System.out.println("\n");

        System.out.println("Employee-02's Details");
        System.out.println("ID : " + emp2.getId());
        System.out.println("Code :" + emp2.getCode());
        System.out.println("Name : " + emp2.getName());
        System.out.println("NIC : " + emp2.getNic());
        System.out.println("Address : " + emp2.getAddress());

        System.out.println("\n");
        
        System.out.println("Employee-03's Details");
        System.out.println("ID : " + emp3.getId());
        System.out.println("Code :" + emp3.getCode());
        System.out.println("Name : " + emp3.getName());
        System.out.println("NIC : " + emp3.getNic());
        System.out.println("Address : " + emp3.getAddress());

        System.out.println("\n");

//Check emp1 with emp2
        //check the memory address emp1 ID & emp2 ID are same in the heap
        System.out.println(emp1.getId() == emp2.getId());
        //check the value of emp1 ID & emp2 ID are same in the heap
        System.out.println(emp1.getId().equals(emp2.getId()));
        //check the memory address emp1 code & emp2 code are same in the heap
        System.out.println(emp1.getCode()==emp2.getCode());
        //check the value of emp1 code & emp2 code are same in the heap
        System.out.println(emp1.getCode().equals(emp2.getCode()));

        System.out.println("\n");

//Check emp1 with emp3
        //check the memory address emp1 ID & emp3 ID are same in the heap
        System.out.println(emp1.getId() == emp3.getId());
        //check the value of emp2 ID & emp3 ID are same in the heap
        System.out.println(emp1.getId().equals(emp3.getId()));
         //check the memory address emp2 code & emp3 code are same in the heap
        System.out.println(emp1.getCode()==emp3.getCode());
         //check the value of emp2 code & emp3 code are same in the heap
        System.out.println(emp1.getCode().equals(emp3.getCode()));

        System.out.println("\n");

//Check emp2 with emp3
        //check the memory address emp2 ID & emp3 ID are same in the heap
        System.out.println(emp2.getId() == emp3.getId());
        //check the value of emp2 ID & emp3 ID are same in the heap
        System.out.println(emp2.getId().equals(emp3.getId()));
         //check the memory address emp2 code & emp3 code are same in the heap
        System.out.println(emp2.getCode()==emp3.getCode());
         //check the value of emp2 code & emp3 code are same in the heap
        System.out.println(emp2.getCode().equals(emp3.getCode()));

        System.out.println("\n");

        



    }     
    
}
