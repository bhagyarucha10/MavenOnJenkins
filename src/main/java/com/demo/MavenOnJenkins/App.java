package com.demo.MavenOnJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
	public int add(int p,int q)
	{
		return p+q;
	}
    public static void main( String[] args )
    {
        App obj=new App();
        System.out.println(obj.add(4, 5));
    }
}
