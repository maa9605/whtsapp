package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.EmojiPicker$EmojiWeight;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ck */
/* loaded from: classes2.dex */
public class C47742Ck implements C2BV {
    public static volatile C47742Ck A03;
    public final AbstractC000600i A00;
    public final C001200o A01;
    public final C003701t A02;

    public C47742Ck(C003701t c003701t, C001200o c001200o, AbstractC000600i abstractC000600i) {
        this.A02 = c003701t;
        this.A01 = c001200o;
        this.A00 = abstractC000600i;
    }

    public static List A00(File file) {
        ArrayList arrayList = new ArrayList();
        JsonReader jsonReader = new JsonReader(new FileReader(file));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if ("weights".equals(jsonReader.nextName())) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        arrayList.add(new EmojiPicker$EmojiWeight(C43981yK.A04(jsonReader.nextName()).A00, (float) jsonReader.nextDouble()));
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static List A01(File file) {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        try {
            return new ArrayList((List) objectInputStream.readObject());
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    objectInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.C2BV
    public C2BY A6l(Object obj, float f) {
        return new EmojiPicker$EmojiWeight((int[]) obj, f);
    }

    @Override // X.C2BV
    public Object AAO(String str) {
        int length = str.length();
        int i = 0;
        int[] iArr = new int[str.codePointCount(0, length)];
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return iArr;
    }

    @Override // X.C2BV
    public String AAn(Object obj) {
        int[] iArr = (int[]) obj;
        return new String(iArr, 0, iArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    @Override // X.C2BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List AEi() {
        /*
            r6 = this;
            X.00o r0 = r6.A01
            android.app.Application r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "emoji"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L6b
            X.01t r1 = r6.A02     // Catch: java.lang.Exception -> L39
            r0 = 505(0x1f9, float:7.08E-43)
            boolean r0 = r1.A0C(r0)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L2b
            java.util.List r0 = A00(r5)     // Catch: java.io.IOException -> L24 java.lang.Exception -> L39
            goto L6c
        L24:
            r0 = move-exception
            java.util.List r0 = A01(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L39
            goto L6c
        L2a:
            throw r0     // Catch: java.lang.Exception -> L39
        L2b:
            java.util.List r0 = A01(r5)     // Catch: java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32 java.lang.Exception -> L39
            goto L6c
        L30:
            r0 = move-exception
            goto L33
        L32:
            r0 = move-exception
        L33:
            java.util.List r0 = A00(r5)     // Catch: java.io.IOException -> L38 java.lang.Exception -> L39
            goto L6c
        L38:
            throw r0     // Catch: java.lang.Exception -> L39
        L39:
            r4 = move-exception
            java.lang.String r0 = "recentemoji/readrecent "
            com.whatsapp.util.Log.e(r0, r4)
            X.00i r3 = r6.A00
            java.lang.String r0 = "json="
            java.lang.StringBuilder r2 = X.C000200d.A0P(r0)
            X.01t r1 = r6.A02
            r0 = 505(0x1f9, float:7.08E-43)
            boolean r0 = r1.A0C(r0)
            r2.append(r0)
            java.lang.String r0 = "; "
            r2.append(r0)
            java.lang.String r0 = r4.toString()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1 = 0
            java.lang.String r0 = "recentemoji/load-error"
            r3.A09(r0, r2, r1)
            r5.delete()
        L6b:
            r0 = 0
        L6c:
            if (r0 != 0) goto L73
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47742Ck.AEi():java.util.List");
    }

    @Override // X.C2BV
    public void AQl(List list) {
        try {
            File file = new File(this.A01.A00.getFilesDir(), "emoji");
            if (this.A02.A0C(505)) {
                JsonWriter jsonWriter = new JsonWriter(new FileWriter(file));
                jsonWriter.beginObject();
                jsonWriter.name("weights");
                jsonWriter.beginObject();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) it.next();
                    jsonWriter.name(C2CI.A00(emojiPicker$EmojiWeight.emoji));
                    jsonWriter.value(emojiPicker$EmojiWeight.weight);
                }
                jsonWriter.endObject();
                jsonWriter.endObject();
                jsonWriter.close();
                return;
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            Log.e(e);
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder A0P = C000200d.A0P("json=");
            A0P.append(this.A02.A0C(505));
            A0P.append("; ");
            A0P.append(e.toString());
            abstractC000600i.A09("recentemoji/save-error", A0P.toString(), false);
        }
    }
}
