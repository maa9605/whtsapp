package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItem$OnMenuItemClickListenerC14290mi implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    public MenuItem$OnMenuItemClickListenerC14290mi(Preference preference) {
        this.A00 = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A02 = preference.A02();
        if (!preference.A0Q || TextUtils.isEmpty(A02)) {
            return;
        }
        contextMenu.setHeaderTitle(A02);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        CharSequence A02 = preference.A02();
        ((ClipboardManager) preference.A05.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", A02));
        Context context = preference.A05;
        Toast.makeText(context, context.getString(R.string.preference_copied, A02), 0).show();
        return true;
    }
}
