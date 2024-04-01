package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import java.util.List;

/* renamed from: X.3xH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86343xH extends AbstractC81493oz {
    public final /* synthetic */ WallpaperPreview A00;

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return view == obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86343xH(WallpaperPreview wallpaperPreview, Context context, Resources resources) {
        super(context, resources);
        this.A00 = wallpaperPreview;
    }

    @Override // X.C0ZT
    public int A0B() {
        List list = this.A00.A0A;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
