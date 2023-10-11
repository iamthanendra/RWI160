class StringAssignment2
{
    public static void main(String[] args)
    {
        String[] name = {"My", "name", "is", "Thanendra", "kashyap"};
        String sep = "_";
        String fullSentence = String.join("_",name);
        System.out.println(fullSentence);
    }
}
