package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.MessageDialogFragment;
import java.util.ArrayList;

/* renamed from: X.0U4  reason: invalid class name */
/* loaded from: classes.dex */
public class C0U4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public DialogInterface.OnClickListener A06;
    public String A07;
    public String A08;
    public Object[] A09;
    public Object[] A0A;

    public C0U4() {
        this.A00 = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public C0U4(int i, Object... objArr) {
        this.A00 = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A01 = i;
        this.A09 = objArr;
    }

    public C0U4(String str) {
        this.A00 = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A07 = str;
    }

    public static final void A00(Bundle bundle, Object[] objArr, String str, String str2) {
        int length;
        if (objArr == null || (length = objArr.length) == 0) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(length);
        ArrayList<Integer> arrayList2 = new ArrayList<>(length);
        for (Object obj : objArr) {
            if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                arrayList2.add(2);
            } else {
                arrayList2.add(1);
            }
            arrayList.add(obj.toString());
        }
        bundle.putStringArrayList(str, arrayList);
        bundle.putIntegerArrayList(str2, arrayList2);
    }

    public DialogFragment A01() {
        MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
        Bundle bundle = new Bundle();
        int i = this.A00;
        if (i != 0) {
            bundle.putInt("id", i);
        }
        int i2 = this.A05;
        if (i2 != 0) {
            bundle.putInt("title_id", i2);
            A00(bundle, this.A0A, "title_params_values", "title_params_types");
        }
        int i3 = this.A02;
        if (i3 != 0) {
            bundle.putInt("message_view_id", i3);
        }
        int i4 = this.A01;
        if (i4 != 0) {
            bundle.putInt("message_id", i4);
            A00(bundle, this.A09, "message_params_values", "message_params_types");
        }
        String str = this.A08;
        if (str != null) {
            bundle.putString("title", str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            bundle.putString("message", str2);
        }
        int i5 = this.A03;
        if (i5 != 0 && this.A06 != null) {
            bundle.putInt("primary_action_text_id", i5);
            messageDialogFragment.A00 = this.A06;
        }
        int i6 = this.A04;
        if (i6 != 0) {
            bundle.putInt("secondary_action_text_id", i6);
        }
        messageDialogFragment.A0P(bundle);
        return messageDialogFragment;
    }
}
