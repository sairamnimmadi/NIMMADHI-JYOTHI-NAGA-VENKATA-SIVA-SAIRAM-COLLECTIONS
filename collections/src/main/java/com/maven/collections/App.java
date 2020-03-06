package com.maven.collections;

/**
 * Hello world!
 *
 */


@SuppressWarnings("rawtypes")
public class App extends ArrayDatastructure
{
	
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
        ArrayDatastructure<Integer> data_structure=new ArrayDatastructure();
        data_structure.addElement(10);
        data_structure.addElement(15);
        data_structure.addElement(61);
        data_structure.addElement(27);
        data_structure.addElement(38);
        data_structure.addElement(62);
        data_structure.addElement(13);
        data_structure.addElement(25);
        data_structure.addElement(47);
        data_structure.addElement(4);
        data_structure.addElement(17);
        data_structure.addElement(5);
        data_structure.addElement(16);
        logger.info(data_structure.getElement(6));
        data_structure.delete(4);
        data_structure.print();
    }
}