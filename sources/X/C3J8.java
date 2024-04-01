package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3J8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3J8 extends C54532iu implements SectionIndexer {
    public List A00;
    public List A01;
    public final /* synthetic */ ContactPickerFragment A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3J8(ContactPickerFragment contactPickerFragment) {
        super(contactPickerFragment);
        this.A02 = contactPickerFragment;
        this.A01 = new ArrayList();
        this.A00 = new ArrayList();
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        List list = this.A00;
        if (i < list.size() && i >= 0) {
            return ((Number) list.get(i)).intValue();
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        return C23X.A00(i, super.A02, this.A01, this.A00);
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return this.A01.toArray(new String[1]);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A05 = C23X.A05(super.A02, this.A02.A0p);
        this.A01 = (List) A05.first;
        this.A00 = (List) A05.second;
    }
}
