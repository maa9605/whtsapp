package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3B0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3B0 extends C0TS {
    public final CheckBox A00;
    public final TextView A01;

    public C3B0(View view) {
        super(view);
        this.A01 = (TextView) C0AT.A0D(view, R.id.media_section);
        CheckBox checkBox = (CheckBox) C0AT.A0D(view, R.id.media_select_all_checkbox);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(R.string.select_all));
        this.A00.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.2vB
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                compoundButton.jumpDrawablesToCurrentState();
            }
        });
    }
}
