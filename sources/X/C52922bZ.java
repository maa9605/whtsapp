package X;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2bZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52922bZ {
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();

    public void A00(int i) {
        this.A00.add(Integer.valueOf(i));
    }

    public void A01(Menu menu, Activity activity) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            if (item.isVisible()) {
                if (this.A00.contains(Integer.valueOf(item.getItemId()))) {
                    i++;
                    item.setShowAsAction(0);
                } else {
                    i2++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material);
        int min = ((Math.min(activity.getWindow().getDecorView().getWidth(), activity.getWindow().getDecorView().getHeight()) - (dimensionPixelSize << 1)) - (activity.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_content_inset_material) << 1)) - (i > 0 ? activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material) : 0);
        if (min < i2 * dimensionPixelSize) {
            if (i == 0) {
                min -= activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material);
            }
            int i4 = i2 - (min / dimensionPixelSize);
            if (i4 > 1 || i > 0) {
                for (int size = menu.size() - 1; size >= 0 && i4 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !this.A00.contains(Integer.valueOf(item2.getItemId())) && !this.A01.contains(Integer.valueOf(item2.getItemId()))) {
                        item2.setShowAsAction(1);
                        i4--;
                    }
                }
            }
        }
    }
}
