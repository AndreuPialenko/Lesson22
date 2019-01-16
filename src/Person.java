public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public static String writePersonToFile (Person person){
//        System.out.println(person.getName());
//
//        String FileName = person.getName();
//
//        if (FileName == null || FileName.isEmpty()){
//            person.setName("empty-person");
//        }
//
//        FileName = person.getName() + ".txt";
//
//        writePerson(person, FileName);
//        return FileName;
//
//    }
//
//    public static void writePerson(Person person, String FileName){
//        //code to write to file
//    }

    public static String writePersonToFileAndGetFileName (Person person){
        String personName = person.getName();
        System.out.println(person.getName());

        String FileName = personName == null || personName.isEmpty()? "empty-person": personName;

        if (FileName == null || FileName.isEmpty()){
            person.setName("empty-person");
        }

        FileName += ".txt";

        boolean isFileWritten = writePerson(person, FileName);


//        if (isFileWritten){
//            return FileName;
//        }else {
//            return "";
//        }

        return isFileWritten? FileName: " ";



    }

    public static boolean writePerson(Person person, String FileName){
        //code to write to file
        return true;
    }

}
