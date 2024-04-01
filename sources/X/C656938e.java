package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.38e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C656938e extends AbstractC58882rr {
    public static final List A02;
    public final C58872rq A00;
    public final List A01;

    static {
        ArrayList arrayList = new ArrayList();
        A02 = arrayList;
        arrayList.add(new C58872rq(5.0f, 7.0f, 65, true));
        A02.add(new C58872rq(4.0f, 1.0f, 72, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C656938e(int i) {
        super(i);
        List list = A02;
        this.A00 = (C58872rq) list.get(list.size() - 1);
        this.A01 = list;
    }

    public static final Float A02(float f, int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    StringBuilder sb = new StringBuilder("ConversationRowSingleImagePreviewCalculator/getSizeToSpec: Unhandled View.MeasureSpec ");
                    sb.append(mode);
                    Log.w(sb.toString());
                    return Float.valueOf(f);
                } else if (f == View.MeasureSpec.getSize(i)) {
                    return Float.valueOf(f);
                } else {
                    return null;
                }
            }
            return Float.valueOf(f);
        }
        return Float.valueOf(Math.min(f, View.MeasureSpec.getSize(i)));
    }
}
