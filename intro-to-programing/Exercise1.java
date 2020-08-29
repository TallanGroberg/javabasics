class Exercise1 {

    public static void main(String[] args)
    {
        int birthday = 11091992;
        double step2 = birthday / 6;
        int step3 = (int) step2;
        int step4 = step3 * 6;
        int magicNumber = birthday - step4;
        System.out.println(magicNumber);
        //all possible magic numbers are 0 through 5 because you cannot have a remainder of 6 for a division by 6 and birthday > 0
    }
}