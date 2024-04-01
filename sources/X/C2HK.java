package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Picture;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2HK */
/* loaded from: classes2.dex */
public abstract class C2HK extends C2HI {
    public final Context A00;

    public C2HK(Context context) {
        this.A00 = context;
    }

    public static Picture A00(Context context, String str) {
        try {
            try {
                AssetManager assets = context.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("graphics/");
                sb.append(str);
                String obj = sb.toString();
                C18230tO c18230tO = new C18230tO();
                InputStream open = assets.open(obj);
                try {
                    C18090tA A0P = c18230tO.A0P(open);
                    if (A0P != null) {
                        return A0P.A00();
                    }
                    return null;
                } finally {
                    try {
                        open.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e) {
                e = e;
                StringBuilder sb2 = new StringBuilder("failed to load SVG from ");
                sb2.append(str);
                Log.e(sb2.toString(), e);
                return null;
            }
        } catch (C18140tF e2) {
            e = e2;
            StringBuilder sb22 = new StringBuilder("failed to load SVG from ");
            sb22.append(str);
            Log.e(sb22.toString(), e);
            return null;
        }
    }
}
