class Alphabet {
void check()
	{
    char c = '*';
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }

	
	public static void main(String[] args) {
    Alphabet A=new Alphabet();
	A.check();
}

}