package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3xA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86273xA extends AbstractC81493oz {
    public boolean A00;
    public final Map A01;
    public final /* synthetic */ SolidColorWallpaperPreview A02;

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return view == obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86273xA(SolidColorWallpaperPreview solidColorWallpaperPreview, Context context) {
        super(context);
        this.A02 = solidColorWallpaperPreview;
        this.A01 = new HashMap();
        this.A00 = false;
    }

    @Override // X.C0ZT
    public int A01(Object obj) {
        if (C03410Fp.A08(((ActivityC02290Ap) this.A02).A0B) && (obj instanceof C2Z4)) {
            Object tag = ((View) obj).getTag();
            if (tag instanceof Integer) {
                int intValue = ((Number) tag).intValue();
                Map map = this.A01;
                Integer valueOf = Integer.valueOf(intValue);
                return (!map.containsKey(valueOf) || Boolean.valueOf(this.A00).equals(map.get(valueOf))) ? -1 : -2;
            }
        }
        return -1;
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A02.A0C.length;
    }
}
