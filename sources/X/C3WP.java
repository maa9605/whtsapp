package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.3WP  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3WP extends BaseAdapter {
    public final Context A00;
    public final /* synthetic */ SolidColorWallpaper A01;

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public C3WP(SolidColorWallpaper solidColorWallpaper, Context context) {
        this.A01 = solidColorWallpaper;
        this.A00 = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A01.A01.length;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        String string;
        if (view == null) {
            view = new C86333xG(this.A00);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        }
        SolidColorWallpaper solidColorWallpaper = this.A01;
        view.setBackgroundColor(solidColorWallpaper.A01[i]);
        if (C03410Fp.A08(solidColorWallpaper.A00)) {
            string = solidColorWallpaper.getString(SolidColorWallpaper.A04[i]);
        } else {
            string = solidColorWallpaper.getString(SolidColorWallpaper.A03[i]);
        }
        view.setContentDescription(string);
        view.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 2));
        return view;
    }
}
