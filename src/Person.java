class Running{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jacob");
        person1.sayHello();
    }
}

class Person {
    private String _name;
    public String getName(){
        return _name;
    }
    
    public void setName(String name){
        _name = name;
    }
    public void sayHello(){
        if(_name.isEmpty()){
            System.out.println("Hello!");
        }else{
            System.out.println("Hello " + _name + "!");
        }
    }
}


