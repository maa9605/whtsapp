package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Kv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68643Kv extends C3FQ {
    public C68643Kv(C012005w c012005w, C40081rY c40081rY, C22e c22e, String str, Context context) {
        super(c012005w, c40081rY, c22e, str, context);
    }

    @Override // java.lang.Runnable
    public void run() {
        File A0F = C0DD.A0F(this.A01, this.A04);
        if (!A0F.exists() || A0F.delete()) {
            return;
        }
        Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
    }
}
