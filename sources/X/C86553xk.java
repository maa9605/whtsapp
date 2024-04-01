package X;

import android.content.Context;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.3xk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86553xk extends AbstractC83163rg {
    public WaImageView A00;
    public WaTextView A01;

    public C86553xk(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), R.layout.storage_usage_gallery_sort_bottom_sheet_row, this);
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        this.A01 = (WaTextView) C0AT.A0D(this, R.id.storage_usage_sort_row_text);
        this.A00 = (WaImageView) C0AT.A0D(this, R.id.storage_usage_sort_row_checkmark);
    }

    public void setChecked(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    public void setText(String str) {
        this.A01.setText(str);
    }
}
