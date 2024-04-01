package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Xml;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.02c */
/* loaded from: classes.dex */
public class SharedPreferencesC004602c implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public boolean A05;
    public final int A06;
    public final C004502b A08;
    public final C004402a A09;
    public final boolean A0E;
    public final Object A0A = new Object();
    public final Object A0B = new Object();
    public Map A04 = new HashMap();
    public final Map A0D = new HashMap();
    public final String A0C = UUID.randomUUID().toString();
    public final Handler A07 = new Handler(Looper.getMainLooper());

    public SharedPreferencesC004602c(C004502b c004502b, boolean z, C004402a c004402a, int i) {
        this.A08 = c004502b;
        this.A0E = z;
        this.A09 = c004402a;
        this.A06 = i;
        synchronized (this.A0A) {
            this.A05 = false;
        }
        this.A09.A00(this.A06, new Runnable() { // from class: X.1Pz
            {
                SharedPreferencesC004602c.this = this;
            }

            public static final Object A00(XmlPullParser xmlPullParser, String[] strArr) {
                int next;
                Object obj = null;
                String attributeValue = xmlPullParser.getAttributeValue(null, "name");
                String name = xmlPullParser.getName();
                int i2 = 1;
                if (!name.equals("null")) {
                    if (name.equals("string")) {
                        String str = "";
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1) {
                                throw new XmlPullParserException("Unexpected end of document in <string>");
                            }
                            if (next2 == 3) {
                                if (!xmlPullParser.getName().equals("string")) {
                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Unexpected end tag in <string>: ")));
                                }
                                strArr[0] = attributeValue;
                                return str;
                            } else if (next2 == 4) {
                                StringBuilder A0P = C000200d.A0P(str);
                                A0P.append(xmlPullParser.getText());
                                str = A0P.toString();
                            } else if (next2 == 2) {
                                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Unexpected start tag in <string>: ")));
                            }
                        }
                    } else {
                        try {
                            if (name.equals("int")) {
                                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
                            } else if (name.equals("long")) {
                                obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                            } else if (name.equals("float")) {
                                obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                            } else if (name.equals("double")) {
                                obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                            } else {
                                obj = name.equals("boolean") ? Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value")) : null;
                            }
                            if (obj == null) {
                                if (name.equals("byte-array")) {
                                    try {
                                        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        byte[] bArr = new byte[parseInt];
                                        int eventType = xmlPullParser.getEventType();
                                        do {
                                            if (eventType == 4) {
                                                if (parseInt > 0) {
                                                    String text = xmlPullParser.getText();
                                                    if (text == null || text.length() != (parseInt << 1)) {
                                                        throw new XmlPullParserException(C000200d.A0H("Invalid value found in byte-array: ", text));
                                                    }
                                                    int i3 = 0;
                                                    while (i3 < parseInt) {
                                                        int i4 = i3 << 1;
                                                        char charAt = text.charAt(i4);
                                                        char charAt2 = text.charAt(i4 + i2);
                                                        bArr[i3] = (byte) (((charAt2 > 'a' ? (charAt2 - 'a') + 10 : charAt2 - '0') & 15) | (((charAt > 'a' ? (charAt - 'a') + 10 : charAt - '0') & 15) << 4));
                                                        i3++;
                                                        i2 = 1;
                                                    }
                                                }
                                            } else if (eventType == 3) {
                                                if (xmlPullParser.getName().equals("byte-array")) {
                                                    strArr[0] = attributeValue;
                                                    return bArr;
                                                }
                                                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "byte-array", " end tag at: ")));
                                            }
                                            eventType = xmlPullParser.next();
                                        } while (eventType != i2);
                                        throw new XmlPullParserException("Document ended before byte-array end tag");
                                    } catch (NullPointerException unused) {
                                        throw new XmlPullParserException("Need num attribute in byte-array");
                                    } catch (NumberFormatException unused2) {
                                        throw new XmlPullParserException("Not a number in num attribute in byte-array");
                                    }
                                } else if (name.equals("int-array")) {
                                    try {
                                        int parseInt2 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        xmlPullParser.next();
                                        int[] iArr = new int[parseInt2];
                                        int eventType2 = xmlPullParser.getEventType();
                                        int i5 = 0;
                                        do {
                                            if (eventType2 == 2) {
                                                if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Expected item tag at: ")));
                                                }
                                                try {
                                                    iArr[i5] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                                                } catch (NullPointerException unused3) {
                                                    throw new XmlPullParserException("Need value attribute in item");
                                                } catch (NumberFormatException unused4) {
                                                    throw new XmlPullParserException("Not a number in value attribute in item");
                                                }
                                            } else if (eventType2 == 3) {
                                                if (xmlPullParser.getName().equals("int-array")) {
                                                    strArr[0] = attributeValue;
                                                    return iArr;
                                                } else if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "int-array", " end tag at: ")));
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            eventType2 = xmlPullParser.next();
                                        } while (eventType2 != 1);
                                        throw new XmlPullParserException("Document ended before int-array end tag");
                                    } catch (NullPointerException unused5) {
                                        throw new XmlPullParserException("Need num attribute in int-array");
                                    } catch (NumberFormatException unused6) {
                                        throw new XmlPullParserException("Not a number in num attribute in int-array");
                                    }
                                } else if (name.equals("long-array")) {
                                    try {
                                        int parseInt3 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        xmlPullParser.next();
                                        long[] jArr = new long[parseInt3];
                                        int eventType3 = xmlPullParser.getEventType();
                                        int i6 = 0;
                                        do {
                                            if (eventType3 == 2) {
                                                if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Expected item tag at: ")));
                                                }
                                                try {
                                                    jArr[i6] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                                                } catch (NullPointerException unused7) {
                                                    throw new XmlPullParserException("Need value attribute in item");
                                                } catch (NumberFormatException unused8) {
                                                    throw new XmlPullParserException("Not a number in value attribute in item");
                                                }
                                            } else if (eventType3 == 3) {
                                                if (xmlPullParser.getName().equals("long-array")) {
                                                    strArr[0] = attributeValue;
                                                    return jArr;
                                                } else if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "long-array", " end tag at: ")));
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            eventType3 = xmlPullParser.next();
                                        } while (eventType3 != 1);
                                        throw new XmlPullParserException("Document ended before long-array end tag");
                                    } catch (NullPointerException unused9) {
                                        throw new XmlPullParserException("Need num attribute in long-array");
                                    } catch (NumberFormatException unused10) {
                                        throw new XmlPullParserException("Not a number in num attribute in long-array");
                                    }
                                } else if (name.equals("double-array")) {
                                    try {
                                        int parseInt4 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        xmlPullParser.next();
                                        double[] dArr = new double[parseInt4];
                                        int eventType4 = xmlPullParser.getEventType();
                                        int i7 = 0;
                                        do {
                                            if (eventType4 == 2) {
                                                if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Expected item tag at: ")));
                                                }
                                                try {
                                                    dArr[i7] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                                                } catch (NullPointerException unused11) {
                                                    throw new XmlPullParserException("Need value attribute in item");
                                                } catch (NumberFormatException unused12) {
                                                    throw new XmlPullParserException("Not a number in value attribute in item");
                                                }
                                            } else if (eventType4 == 3) {
                                                if (xmlPullParser.getName().equals("double-array")) {
                                                    strArr[0] = attributeValue;
                                                    return dArr;
                                                } else if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "double-array", " end tag at: ")));
                                                } else {
                                                    i7++;
                                                }
                                            }
                                            eventType4 = xmlPullParser.next();
                                        } while (eventType4 != 1);
                                        throw new XmlPullParserException("Document ended before double-array end tag");
                                    } catch (NullPointerException unused13) {
                                        throw new XmlPullParserException("Need num attribute in double-array");
                                    } catch (NumberFormatException unused14) {
                                        throw new XmlPullParserException("Not a number in num attribute in double-array");
                                    }
                                } else if (name.equals("string-array")) {
                                    try {
                                        int parseInt5 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        xmlPullParser.next();
                                        String[] strArr2 = new String[parseInt5];
                                        int eventType5 = xmlPullParser.getEventType();
                                        int i8 = 0;
                                        do {
                                            if (eventType5 == 2) {
                                                if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Expected item tag at: ")));
                                                }
                                                try {
                                                    strArr2[i8] = xmlPullParser.getAttributeValue(null, "value");
                                                } catch (NullPointerException unused15) {
                                                    throw new XmlPullParserException("Need value attribute in item");
                                                } catch (NumberFormatException unused16) {
                                                    throw new XmlPullParserException("Not a number in value attribute in item");
                                                }
                                            } else if (eventType5 == 3) {
                                                if (xmlPullParser.getName().equals("string-array")) {
                                                    strArr[0] = attributeValue;
                                                    return strArr2;
                                                } else if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "string-array", " end tag at: ")));
                                                } else {
                                                    i8++;
                                                }
                                            }
                                            eventType5 = xmlPullParser.next();
                                        } while (eventType5 != 1);
                                        throw new XmlPullParserException("Document ended before string-array end tag");
                                    } catch (NullPointerException unused17) {
                                        throw new XmlPullParserException("Need num attribute in string-array");
                                    } catch (NumberFormatException unused18) {
                                        throw new XmlPullParserException("Not a number in num attribute in string-array");
                                    }
                                } else if (name.equals("boolean-array")) {
                                    try {
                                        int parseInt6 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                        xmlPullParser.next();
                                        boolean[] zArr = new boolean[parseInt6];
                                        int eventType6 = xmlPullParser.getEventType();
                                        int i9 = 0;
                                        do {
                                            if (eventType6 == 2) {
                                                if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0P("Expected item tag at: ")));
                                                }
                                                try {
                                                    zArr[i9] = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "value"));
                                                } catch (NullPointerException unused19) {
                                                    throw new XmlPullParserException("Need value attribute in item");
                                                } catch (NumberFormatException unused20) {
                                                    throw new XmlPullParserException("Not a number in value attribute in item");
                                                }
                                            } else if (eventType6 == 3) {
                                                if (xmlPullParser.getName().equals("boolean-array")) {
                                                    strArr[0] = attributeValue;
                                                    return zArr;
                                                } else if (!xmlPullParser.getName().equals("item")) {
                                                    throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "boolean-array", " end tag at: ")));
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            eventType6 = xmlPullParser.next();
                                        } while (eventType6 != 1);
                                        throw new XmlPullParserException("Document ended before boolean-array end tag");
                                    } catch (NullPointerException unused21) {
                                        throw new XmlPullParserException("Need num attribute in string-array");
                                    } catch (NumberFormatException unused22) {
                                        throw new XmlPullParserException("Not a number in num attribute in string-array");
                                    }
                                } else if (name.equals("map")) {
                                    xmlPullParser.next();
                                    HashMap hashMap = new HashMap();
                                    int eventType7 = xmlPullParser.getEventType();
                                    do {
                                        if (eventType7 == 2) {
                                            hashMap.put(strArr[0], A00(xmlPullParser, strArr));
                                        } else if (eventType7 == 3) {
                                            if (!xmlPullParser.getName().equals("map")) {
                                                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "map", " end tag at: ")));
                                            }
                                            strArr[0] = attributeValue;
                                            return hashMap;
                                        }
                                        eventType7 = xmlPullParser.next();
                                    } while (eventType7 != 1);
                                    throw new XmlPullParserException("Document ended before map end tag");
                                } else if (name.equals("list")) {
                                    xmlPullParser.next();
                                    ArrayList arrayList = new ArrayList();
                                    int eventType8 = xmlPullParser.getEventType();
                                    do {
                                        if (eventType8 == 2) {
                                            arrayList.add(A00(xmlPullParser, strArr));
                                        } else if (eventType8 == 3) {
                                            if (!xmlPullParser.getName().equals("list")) {
                                                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "list", " end tag at: ")));
                                            }
                                            strArr[0] = attributeValue;
                                            return arrayList;
                                        }
                                        eventType8 = xmlPullParser.next();
                                    } while (eventType8 != 1);
                                    throw new XmlPullParserException("Document ended before list end tag");
                                } else if (name.equals("set")) {
                                    xmlPullParser.next();
                                    HashSet hashSet = new HashSet();
                                    int eventType9 = xmlPullParser.getEventType();
                                    do {
                                        if (eventType9 == 2) {
                                            hashSet.add(A00(xmlPullParser, strArr));
                                        } else if (eventType9 == 3) {
                                            if (!xmlPullParser.getName().equals("set")) {
                                                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Expected ", "set", " end tag at: ")));
                                            }
                                            strArr[0] = attributeValue;
                                            return hashSet;
                                        }
                                        eventType9 = xmlPullParser.next();
                                    } while (eventType9 != 1);
                                    throw new XmlPullParserException("Document ended before set end tag");
                                } else {
                                    throw new XmlPullParserException(C000200d.A0H("Unknown tag: ", name));
                                }
                            }
                        } catch (NullPointerException unused23) {
                            throw new XmlPullParserException(C000200d.A0I("Need value attribute in <", name, ">"));
                        } catch (NumberFormatException unused24) {
                            throw new XmlPullParserException(C000200d.A0I("Not a number in value attribute in <", name, ">"));
                        }
                    }
                }
                do {
                    next = xmlPullParser.next();
                    if (next == 1) {
                        throw new XmlPullParserException(C000200d.A0I("Unexpected end of document in <", name, ">"));
                    }
                    if (next == 3) {
                        if (xmlPullParser.getName().equals(name)) {
                            strArr[0] = attributeValue;
                            return obj;
                        }
                        throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Unexpected end tag in <", name, ">: ")));
                    } else if (next == 4) {
                        throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Unexpected text in <", name, ">: ")));
                    }
                } while (next != 2);
                throw new XmlPullParserException(C000200d.A0O(xmlPullParser, C000200d.A0W("Unexpected start tag in <", name, ">: ")));
            }

            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesC004602c sharedPreferencesC004602c = SharedPreferencesC004602c.this;
                Object obj = sharedPreferencesC004602c.A0A;
                synchronized (obj) {
                    if (sharedPreferencesC004602c.A05) {
                        return;
                    }
                    try {
                        C004502b c004502b2 = sharedPreferencesC004602c.A08;
                        Map map = sharedPreferencesC004602c.A04;
                        synchronized (c004502b2.A02) {
                            File file = c004502b2.A00;
                            if (file.exists()) {
                                File file2 = c004502b2.A01;
                                file2.delete();
                                file.renameTo(file2);
                            }
                            File file3 = c004502b2.A01;
                            if (file3.canRead()) {
                                try {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3), 16384);
                                    try {
                                        XmlPullParser newPullParser = Xml.newPullParser();
                                        newPullParser.setInput(bufferedInputStream, "UTF-8");
                                        String[] strArr = new String[1];
                                        int eventType = newPullParser.getEventType();
                                        while (eventType != 2) {
                                            if (eventType == 3) {
                                                throw new XmlPullParserException(C000200d.A0O(newPullParser, C000200d.A0P("Unexpected end tag at: ")));
                                            }
                                            if (eventType != 4) {
                                                eventType = newPullParser.next();
                                                if (eventType == 1) {
                                                    throw new XmlPullParserException("Unexpected end of document");
                                                }
                                            } else {
                                                StringBuilder A0P = C000200d.A0P("Unexpected text: ");
                                                A0P.append(newPullParser.getText());
                                                throw new XmlPullParserException(A0P.toString());
                                            }
                                        }
                                        HashMap hashMap = (HashMap) A00(newPullParser, strArr);
                                        if (hashMap != null) {
                                            map.putAll(hashMap);
                                        }
                                        bufferedInputStream.close();
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("DefaultSharedPreferencesStorage/Cannot read ");
                                    sb.append(file3.getAbsolutePath());
                                    Log.e(sb.toString(), e);
                                    throw e;
                                } catch (XmlPullParserException e2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("DefaultSharedPreferencesStorage/Parsing error while reading ");
                                    sb2.append(file3.getAbsolutePath());
                                    sb2.append(" : content = \n");
                                    StringBuilder sb3 = new StringBuilder();
                                    try {
                                        FileReader fileReader = new FileReader(file3);
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                                            while (true) {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                sb3.append(readLine);
                                                sb3.append("\n");
                                            }
                                            bufferedReader.close();
                                            fileReader.close();
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                try {
                                                    fileReader.close();
                                                } catch (Throwable unused) {
                                                }
                                                throw th2;
                                            }
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    sb2.append(sb3.toString());
                                    Log.e(sb2.toString(), e2);
                                    throw e2;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("LightSharedPreferencesImpl/Cannot read preferences from ");
                        sb4.append(sharedPreferencesC004602c.A08);
                        Log.e(sb4.toString(), e3);
                    } catch (Throwable th3) {
                        sharedPreferencesC004602c.A03 = th3;
                    }
                    sharedPreferencesC004602c.A05 = true;
                    obj.notifyAll();
                }
            }
        }, false);
    }

    public final void A00() {
        while (!this.A05) {
            try {
                this.A0A.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    public final void A01(final C0MH c0mh, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: X.1Py
            {
                SharedPreferencesC004602c.this = this;
            }

            public static final void A00(Object obj, String str, XmlSerializer xmlSerializer) {
                String str2;
                if (obj == null) {
                    xmlSerializer.startTag(null, "null");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.endTag(null, "null");
                } else if (obj instanceof String) {
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
                } else {
                    if (obj instanceof Integer) {
                        str2 = "int";
                    } else if (obj instanceof Long) {
                        str2 = "long";
                    } else if (obj instanceof Float) {
                        str2 = "float";
                    } else if (obj instanceof Double) {
                        str2 = "double";
                    } else if (!(obj instanceof Boolean)) {
                        int i = 0;
                        if (obj instanceof byte[]) {
                            byte[] bArr = (byte[]) obj;
                            xmlSerializer.startTag(null, "byte-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length = bArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length));
                            StringBuilder sb = new StringBuilder(length << 1);
                            while (i < length) {
                                byte b = bArr[i];
                                int i2 = (b >> 4) & 15;
                                sb.append((char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48));
                                int i3 = b & 15;
                                sb.append((char) (i3 >= 10 ? (i3 + 97) - 10 : i3 + 48));
                                i++;
                            }
                            xmlSerializer.text(sb.toString());
                            xmlSerializer.endTag(null, "byte-array");
                            return;
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            xmlSerializer.startTag(null, "int-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length2 = iArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length2));
                            while (i < length2) {
                                xmlSerializer.startTag(null, "item");
                                xmlSerializer.attribute(null, "value", Integer.toString(iArr[i]));
                                xmlSerializer.endTag(null, "item");
                                i++;
                            }
                            xmlSerializer.endTag(null, "int-array");
                            return;
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            xmlSerializer.startTag(null, "long-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length3 = jArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length3));
                            while (i < length3) {
                                xmlSerializer.startTag(null, "item");
                                xmlSerializer.attribute(null, "value", Long.toString(jArr[i]));
                                xmlSerializer.endTag(null, "item");
                                i++;
                            }
                            xmlSerializer.endTag(null, "long-array");
                            return;
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            xmlSerializer.startTag(null, "double-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length4 = dArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length4));
                            while (i < length4) {
                                xmlSerializer.startTag(null, "item");
                                xmlSerializer.attribute(null, "value", Double.toString(dArr[i]));
                                xmlSerializer.endTag(null, "item");
                                i++;
                            }
                            xmlSerializer.endTag(null, "double-array");
                            return;
                        } else if (obj instanceof String[]) {
                            String[] strArr = (String[]) obj;
                            xmlSerializer.startTag(null, "string-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length5 = strArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length5));
                            while (i < length5) {
                                xmlSerializer.startTag(null, "item");
                                xmlSerializer.attribute(null, "value", strArr[i]);
                                xmlSerializer.endTag(null, "item");
                                i++;
                            }
                            xmlSerializer.endTag(null, "string-array");
                            return;
                        } else if (obj instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj;
                            xmlSerializer.startTag(null, "boolean-array");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int length6 = zArr.length;
                            xmlSerializer.attribute(null, "num", Integer.toString(length6));
                            while (i < length6) {
                                xmlSerializer.startTag(null, "item");
                                xmlSerializer.attribute(null, "value", Boolean.toString(zArr[i]));
                                xmlSerializer.endTag(null, "item");
                                i++;
                            }
                            xmlSerializer.endTag(null, "boolean-array");
                            return;
                        } else if (obj instanceof Map) {
                            A01((Map) obj, str, xmlSerializer);
                            return;
                        } else if (obj instanceof List) {
                            List list = (List) obj;
                            xmlSerializer.startTag(null, "list");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            int size = list.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                A00(list.get(i4), null, xmlSerializer);
                            }
                            xmlSerializer.endTag(null, "list");
                            return;
                        } else if (obj instanceof Set) {
                            Set<Object> set = (Set) obj;
                            xmlSerializer.startTag(null, "set");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            for (Object obj2 : set) {
                                A00(obj2, null, xmlSerializer);
                            }
                            xmlSerializer.endTag(null, "set");
                            return;
                        } else if (obj instanceof CharSequence) {
                            xmlSerializer.startTag(null, "string");
                            if (str != null) {
                                xmlSerializer.attribute(null, "name", str);
                            }
                            xmlSerializer.text(obj.toString());
                            xmlSerializer.endTag(null, "string");
                            return;
                        } else {
                            StringBuilder sb2 = new StringBuilder("writeValueXml: unable to write value ");
                            sb2.append(obj);
                            throw new RuntimeException(sb2.toString());
                        }
                    } else {
                        str2 = "boolean";
                    }
                    xmlSerializer.startTag(null, str2);
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.attribute(null, "value", obj.toString());
                    xmlSerializer.endTag(null, str2);
                }
            }

            public static final void A01(Map map, String str, XmlSerializer xmlSerializer) {
                if (map == null) {
                    xmlSerializer.startTag(null, "null");
                    xmlSerializer.endTag(null, "null");
                    return;
                }
                xmlSerializer.startTag(null, "map");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                for (Map.Entry entry : map.entrySet()) {
                    A00(entry.getValue(), (String) entry.getKey(), xmlSerializer);
                }
                xmlSerializer.endTag(null, "map");
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:3|4|(4:6|(1:(3:9|1f|(1:16)))|17|18)|30|31|3d|18) */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x01d0, code lost:
                r1 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x01d1, code lost:
                com.whatsapp.util.Log.e("LightSharedPreferencesImpl/writeToFile: Got exception:", r1);
                r5.A04 = false;
                r5.A03.countDown();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 496
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC28081Py.run():void");
            }
        };
        if (z) {
            synchronized (this.A0A) {
                z2 = this.A00 == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        this.A09.A00(this.A06, runnable, true ^ z);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A0A) {
            A00();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A0A) {
            A00();
        }
        return new C0MG(this);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A0A) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        synchronized (this.A0A) {
            A00();
            Boolean bool = (Boolean) this.A04.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        synchronized (this.A0A) {
            A00();
            Float f2 = (Float) this.A04.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        synchronized (this.A0A) {
            A00();
            Integer num = (Integer) this.A04.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        synchronized (this.A0A) {
            A00();
            Long l = (Long) this.A04.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        synchronized (this.A0A) {
            A00();
            String str3 = (String) this.A04.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        synchronized (this.A0A) {
            A00();
            Set set2 = (Set) this.A04.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        Handler handler = this.A07;
        synchronized (this.A0A) {
            Map map = this.A0D;
            if (str != null) {
                WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    map.put(str, weakHashMap);
                }
                if (onSharedPreferenceChangeListener == null) {
                    throw null;
                }
                if (handler != null) {
                    weakHashMap.put(onSharedPreferenceChangeListener, handler);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        synchronized (this.A0A) {
            Map map = this.A0D;
            if (str != null) {
                Map map2 = (Map) map.get(str);
                if (map2 != null) {
                    if (onSharedPreferenceChangeListener == null) {
                        throw null;
                    }
                    map2.remove(onSharedPreferenceChangeListener);
                }
            } else {
                throw null;
            }
        }
    }
}
