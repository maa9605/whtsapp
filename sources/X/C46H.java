package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.46H */
/* loaded from: classes3.dex */
public class C46H {
    public static volatile C46H A01;
    public final C012005w A00;

    public C46H(C012005w c012005w) {
        this.A00 = c012005w;
    }

    public File A00(String str) {
        File A012;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A012 = null;
        } else {
            A012 = AbstractC012105x.A01(this.A00.A0B(), "bloks_captured_media");
            if (A012 != null && !A012.exists() && !A012.mkdirs()) {
                Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
                return null;
            }
        }
        return new File(A012.getPath(), str);
    }
}
