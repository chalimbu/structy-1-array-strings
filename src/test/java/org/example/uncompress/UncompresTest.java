package org.example.uncompress;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class UncompresTest {



    @Test
    void test00() {
        assertEquals("ccaaat",Uncompres.uncompress("2c3a1t"));
    }
    @Test
    void test01() {
        assertEquals("ssssbb",Uncompres.uncompress("4s2b"));
    }
    @Test
    void test02() {
        assertEquals( "ppoppppp",Uncompres.uncompress("2p1o5p"));
    }
    @Test
    void test03() {
        assertEquals("nnneeeeeeeeeeeezz",Uncompres.uncompress("3n12e2z"));
    }
    @Test
    void test04() {
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy",Uncompres.uncompress("127y"));
    }




}

