package X;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.2MS  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2MS {
    public static volatile C2MS A02;
    public final C018708s A00;
    public final C05M A01;

    public C2MS(C05M c05m, C018708s c018708s) {
        this.A01 = c05m;
        this.A00 = c018708s;
    }

    public static final Intent A00(String str, String str2, boolean z, boolean z2) {
        Intent intent;
        if (z) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z2) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                contentValues.put("data2", str2);
                arrayList.add(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues2.put("data1", str2);
                arrayList.add(contentValues2);
                intent.putParcelableArrayListExtra("data", arrayList);
            } else {
                intent.putExtra("name", str2);
            }
        }
        intent.putExtra("phone", str);
        intent.putExtra("phone_type", 2);
        intent.setFlags(524288);
        return intent;
    }

    public Intent A01(C06C c06c, AbstractC005302j abstractC005302j, boolean z) {
        String A0A;
        boolean z2;
        String A022 = C04630Le.A02(abstractC005302j);
        if (c06c != null && c06c.A0B()) {
            if (this.A00 != null) {
                A0A = c06c.A05();
                z2 = true;
            } else {
                throw null;
            }
        } else {
            A0A = this.A01.A0A(abstractC005302j);
            z2 = false;
        }
        return A00(A022, A0A, z, z2);
    }
}
