package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3HF */
/* loaded from: classes2.dex */
public class C3HF implements C2BV {
    public static volatile C3HF A07;
    public final C0F2 A00;
    public final C001200o A01;
    public final C40081rY A02;
    public final C43811y1 A03;
    public final C43791xz A04;
    public final Map A05;
    public final Map A06;

    public C3HF(C001200o c001200o, C40081rY c40081rY, C43811y1 c43811y1, C43791xz c43791xz, C0F2 c0f2) {
        this.A01 = c001200o;
        this.A02 = c40081rY;
        this.A03 = c43811y1;
        this.A04 = c43791xz;
        this.A00 = c0f2;
        List A01 = C30O.A01(false);
        this.A05 = new ConcurrentHashMap();
        Iterator it = ((AbstractCollection) A01).iterator();
        while (it.hasNext()) {
            C2K1 c2k1 = (C2K1) it.next();
            this.A05.put(c2k1.ADR(), c2k1);
        }
        this.A06 = new ConcurrentHashMap();
    }

    @Override // X.C2BV
    public C2BY A6l(Object obj, float f) {
        return new C3HE((C2K1) obj, Float.valueOf(f));
    }

    @Override // X.C2BV
    public Object AAO(String str) {
        Object obj = this.A05.get(str);
        return obj == null ? this.A06.get(str) : obj;
    }

    @Override // X.C2BV
    public String AAn(Object obj) {
        return ((C2K1) obj).ADR();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    @Override // X.C2BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List AEi() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3HF.AEi():java.util.List");
    }

    @Override // X.C2BV
    public void AQl(List list) {
        try {
            JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(new FileOutputStream(new File(this.A01.A00.getFilesDir(), "content_stickers")), "UTF-8"));
            jsonWriter.setIndent("");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3HE c3he = (C3HE) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("tag").value(c3he.A01.ADR());
                jsonWriter.name("weight").value(c3he.A00);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.close();
        } catch (IOException e) {
            Log.e(e);
        }
    }
}
