package X;

import android.content.Context;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.4Aw */
/* loaded from: classes3.dex */
public class C90404Aw {
    public C4B3 A00;
    public C4B7 A01;
    public final Context A02;
    public final Properties A03;
    public final C90394Av A04;
    public final C4BA A05;

    public C90404Aw(Context context, C4BA c4ba) {
        String str;
        this.A05 = c4ba;
        this.A02 = context;
        this.A00 = c4ba.A03;
        Properties properties = new Properties();
        try {
            properties.load(this.A02.getAssets().open("version.properties"));
            this.A03 = properties;
            this.A04 = new C90394Av(this);
            if (c4ba.A03 == null || (str = c4ba.A00) == null) {
                return;
            }
            this.A01 = new C4B7(this.A00, str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
