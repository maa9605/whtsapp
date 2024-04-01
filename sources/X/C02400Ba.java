package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.0Ba */
/* loaded from: classes.dex */
public final class C02400Ba {
    public final Context A00;
    public final SharedPreferences A01;
    public final C0Bb A02;
    public final Map A03;

    public C02400Ba(Context context) {
        boolean isEmpty;
        C0Bb c0Bb = new C0Bb();
        this.A03 = new C006702y();
        this.A00 = context;
        this.A01 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.A02 = c0Bb;
        File file = new File(C02160Ac.A04(this.A00), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = this.A01.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                A02();
                FirebaseInstanceId.getInstance(C08U.A00()).A08();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf("").length() + 3);
        sb.append("");
        sb.append("|S|");
        sb.append(str);
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        int length = String.valueOf("").length() + 4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + length);
        sb.append("");
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void A02() {
        File[] listFiles;
        this.A03.clear();
        Context context = this.A00;
        File A04 = C02160Ac.A04(context);
        if (A04 == null || !A04.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A04 = context.getFilesDir();
        }
        for (File file : A04.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }
}
