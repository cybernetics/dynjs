package org.dynjs.runtime;

import org.junit.Test;
import static org.fest.assertions.Assertions.*;

public class WhileStatementTest extends AbstractDynJSTestSupport {

    @Test
    public void testBasicLoop() {
        eval( "var x = 0;",
                "while(x < 10) {",
                "  ++x;",
                "}" );
        
        Object x = getContext().resolve("x").getValue(getContext());
        assertThat( x ).isEqualTo(10);
    }
    
    @Test
    public void testLoopWithBreak() {
        eval( "var x = 0;",
                "while(true){",
                "  ++x;",
                "  if(x==10){",
                "    break;",
                "  }",
                "}" );
        Object x = getContext().resolve("x").getValue(getContext());
        assertThat( x ).isEqualTo(10);
    }
    
    @Test
    public void testLoopWithContinue() {
        eval( "var x = 0;",
                "var y = 0;",
                "while(true){",
                "  ++x;",
                "  if(x==10){",
                "    break;",
                "  }",
                "  if(x % 2 == 0){",
                "    continue;",
                "  }",
                " ++y",
                "}" );
        
        Object x = getContext().resolve("x").getValue(getContext());
        assertThat( x ).isEqualTo(10);
        
        Object y = getContext().resolve("y").getValue(getContext());
        assertThat( y ).isEqualTo(5);
    }
    
    @Test
    public void testNullCondition() {
        Object result = eval( "var x = 1;",
                "while (null) {",
                "  x = 2;",
                "}",
                "x;" );
        
        assertThat( result ).isEqualTo(1);
    }
    
    @Test
    public void testZeroCondition() {
        Object result = eval( "var x = 1;",
                "while (0) {",
                "  x = 2;",
                "}",
                "x;" );
        
        assertThat( result ).isEqualTo(1);
    }
    
    @Test
    public void testUndefinedCondition() {
        Object result = eval( "var x = 1;",
                "while (undefined) {",
                "  x = 2;",
                "}",
                "x;" );
        
        assertThat( result ).isEqualTo(1);
    }
    
}