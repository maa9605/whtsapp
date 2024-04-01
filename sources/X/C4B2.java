package X;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: X.4B2  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4B2 extends DefaultHandler {
    public static String A00;
    public static C4B1 A01;
    public static final List A02 = new ArrayList();

    public void finalize() {
    }

    public C4B2(String str) {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new C4B4(C4B5.PARSER_MISCONFIG);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        A00 = String.copyValueOf(cArr, i, i2).trim();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        int hashCode = str3.hashCode();
        if (hashCode == 106079) {
            if (!str3.equals("key")) {
                return;
            }
            A02.add(A01);
        } else if (hashCode == 492250706 && str3.equals("keyValue")) {
            A01.A02 = A00;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3.hashCode() == 106079 && str3.equals("key")) {
            C4B1 c4b1 = new C4B1();
            A01 = c4b1;
            c4b1.A01 = attributes.getValue("ki");
            A01.A00 = attributes.getValue("owner");
        }
    }
}
