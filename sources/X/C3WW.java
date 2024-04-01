package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.3WW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3WW extends BaseAdapter {
    public final Context A00;
    public final /* synthetic */ WallpaperPicker A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C3WW(WallpaperPicker wallpaperPicker, Context context) {
        this.A01 = wallpaperPicker;
        this.A00 = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A01.A06.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        WallpaperPicker wallpaperPicker = this.A01;
        int intValue = ((Number) wallpaperPicker.A06.get(i)).intValue();
        if (view == null) {
            view = new C86333xG(this.A00);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            view.setContentDescription(wallpaperPicker.getString(R.string.wallpaper));
        }
        ImageView imageView = (ImageView) view;
        Resources resources = wallpaperPicker.A00;
        if (resources != null) {
            imageView.setImageDrawable(resources.getDrawable(intValue));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 3));
            return view;
        }
        throw null;
    }
}
