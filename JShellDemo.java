
import java.util.List;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

public class JShellDemo {

	public static void main(String[] args) {
	   JShell jshell =  JShell.create();
	   
	   List<SnippetEvent> snippets = jshell.eval("10 + 20");
	   
	   snippets.forEach( s ->  System.out.println(s.value()));
	   
	   

	}

}
