
package com.dbmi.prober;

import org.xml.sax.SAXParseException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;

import java.util.logging.Level;

/**
 * Handles SAX parsing of XML configuration files for the ServiceProbe. WARNING: The most likely
 * cause for a NullPointerException in this class is a misspelled attribute name
 * in an XML configuration file.
 */
public class ConfigurationHandler extends DefaultHandler {

   private String charResults = "";

   public ConfigurationHandler(){
   } // NULL CONSTRUCTOR()

   public void startDocument(){
      // SET EVERTHING TO AN INTIAL STATE
      charResults = "";
   } // STARTDOCUMENT()

   public void startElement(String uri,String localName,String qName, Attributes attrs){
      charResults = "";  // READY TO COLLECT NEW CHARACTER DATA
      if(localName.compareTo("probeconfig")==0){
      }else if(localName.compareTo("listenerport")==0){
      }else if(localName.compareTo("service")==0){
      }else if(localName.compareTo("target")==0){
      }else if(localName.compareTo("infolog")==0){
         String logPath = attrs.getValue("path");
         String logName = attrs.getValue("name");
      }else if(localName.compareTo("server")==0){
      }else if(localName.compareTo("proberate")==0){
         int factor = 1000;  // DEFAULT = SECONDS
         String unit =  attrs.getValue("unitsize");
         if(unit.compareTo("second")==0) factor = factor * 1;  // TAKE CARE OF THE DEFAULT CASE
         else if(unit.compareTo("minute")==0) factor = factor * 60;
         else if(unit.compareTo("hour")==0) factor = factor * 3600;
      }else if(localName.compareTo("protocol")==0){
      }else if(localName.compareTo("request")==0){
      }else if(localName.compareTo("requesturl")==0){
      }else if(localName.compareTo("response")==0){
      }else if(localName.compareTo("alert")==0){
      }else if(localName.compareTo("alerter")==0){  // CREATE A NEW ALERTER
      }else if(localName.compareTo("who")==0){
      }else if(localName.compareTo("repeat")==0){
      }else if(localName.compareTo("message")==0){
      }else if(localName.compareTo("blackout")==0){
      } // IF-ELSE
   } // STARTELEMENT(STRING,STRING,STRING,ATTRIBUTES)

   public void characters(char[] ch, int start, int length){
      charResults = charResults + new String(ch,start,length); // ACCUMULATE THE CHARACTERS
   } // CHARACTERS(CHAR[],INT,INT)

   @SuppressWarnings("unused")
   public void endElement(String uri,String localName,String qName){
      if(localName.compareTo("probeconfig")==0){
      }else if(localName.compareTo("listenerport")==0){
      }else if(localName.compareTo("infolog")==0){
      }else if(localName.compareTo("service")==0){
      }else if(localName.compareTo("target")==0){
      }else if(localName.compareTo("server")==0){
      }else if(localName.compareTo("proberate")==0){
      }else if(localName.compareTo("protocol")==0){
      }else if(localName.compareTo("request")==0){
      }else if(localName.compareTo("requesturl")==0){
      }else if(localName.compareTo("response")==0){
      }else if(localName.compareTo("alert")==0){
      }else if(localName.compareTo("alerter")==0){
      }else if(localName.compareTo("who")==0){
      }else if(localName.compareTo("repeat")==0){
      }else if(localName.compareTo("message")==0){
      }else if(localName.compareTo("blackout")==0){
      } // IF-ELSE
   } // ENDELEMENT(STRING,STRING,STRING,ATTRIBUTES)

   public void endDocument(){
   } // ENDDOCUMENT()

   public void error(SAXParseException spe){
      // if(myServiceImpl != null)myServiceImpl.getProbeLogger().logIt(Level.SEVERE, "SAX Failure: " + spe);
      System.out.println("FATAL ERROR parsing XML config file: " + spe);
      System.exit(27007);
   } // ERROR(SAXPARSEEXCEPTION)

   public void warning(SAXParseException spe){
      // if(myServiceImpl != null)myServiceImpl.getProbeLogger().logIt(Level.WARNING, "SAX Failure: " + spe);
      System.out.println("WARNING occurred parsing XML config file: " + spe);
   } // WARNING(SAXPARSEEXCEPTION)

   public String returnAttrsString(Attributes attrs, String name){
      if(attrs.getValue(name)==null){
         this.error(new SAXParseException("Null attribute string.",new LocatorImpl()));
      } // IF
      return attrs.getValue(name);
   } // STRING(ATTRIBUTES,STRING)

} // CLASS
