package X;

import android.app.Application;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1vF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42151vF {
    public static volatile C42151vF A02;
    public boolean A00;
    public final C001200o A01;

    public C42151vF(C001200o c001200o) {
        this.A01 = c001200o;
    }

    public static C42151vF A00() {
        if (A02 == null) {
            synchronized (C42151vF.class) {
                if (A02 == null) {
                    A02 = new C42151vF(C001200o.A01);
                }
            }
        }
        return A02;
    }

    public void A01() {
        Application application = this.A01.A00;
        File file = new File(application.getFilesDir(), "login_failed");
        file.getAbsolutePath();
        file.exists();
        if (file.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(application.openFileInput("login_failed"));
                this.A00 = dataInputStream.readBoolean();
                dataInputStream.close();
                return;
            } catch (IOException e) {
                Log.w("loginmanager/failed login_failed", e);
                this.A00 = false;
                return;
            }
        }
        Log.i("loginmanager/loadloginfailed/none");
        this.A00 = false;
    }

    public void A02(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(this.A01.A00.openFileOutput("login_failed", 0));
                dataOutputStream.writeBoolean(this.A00);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.w("loginmanager/failed/save login_failed", e);
            }
        }
    }
}
