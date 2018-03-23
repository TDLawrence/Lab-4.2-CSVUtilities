import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CSVUtilities
{private ArrayList<String>CSVData;
 private int numColumns;	

    public CSVUtilities(File csv)
    { this.CSVData=CSVData;
      this.numColumns=numColumns;
      Path pathToFile=Paths.get(csv.getName());
      try (BufferedReader br=Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {String line=br.readLine();
           while(line!=null)
             {String[]attributes=line.split(",");
              for (int x=0;x<attributes.length;x++)
                {CSVData.add(attributes[x]);
                }
              numColumns=attributes.length; 	 
              line=br.readLine();
             }   	 
         }
     catch (IOException ioe)
     {ioe.printStackTrace();}
    }
    
    
    public List <String>GetColumnHeaders()
    {ArrayList<String> columnheaders= new ArrayList<String>();
     for(int y=0;y<numColumns;y++)
       {columnheaders.add(CSVData.get(y)); 
       }
     return columnheaders;
    }

    public List<String>getDataString(int column)
    {ArrayList<String>columndata=new ArrayList<String>();
     for (int z=1;z<((CSVData.size())/numColumns);z++)
         {columndata.add(CSVData.get(column*z));
         }
    	return columndata;
    }
    public List<Integer>getDataInt(int column)
    {ArrayList<Integer>columndata=new ArrayList<Integer>();
    for (int z=1;z<((CSVData.size())/numColumns);z++)
        {columndata.add(CSVData.get(column*z));
        }
   	return columndata;
   }
    public List<Double>getDataDouble(int column)
    {
    	
    }
    
 

	
}
