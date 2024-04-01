package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1Jr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26551Jr extends CursorAdapter {
    public ActivityC02290Ap A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26551Jr(AudioPickerActivity audioPickerActivity, ActivityC02290Ap activityC02290Ap) {
        super(activityC02290Ap, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = activityC02290Ap;
    }

    public final C26541Jq A00(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        AudioPickerActivity audioPickerActivity = this.A01;
        int i = cursor.getInt(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        cursor.getString(4);
        return new C26541Jq(audioPickerActivity, i, string, string2, string3, cursor.getInt(5), cursor.getInt(6));
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        new C26561Js(this.A01, view, cursor.getPosition()).A04(A00(cursor), this.A00);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A01.getLayoutInflater().inflate(R.layout.audio_file_row, viewGroup, false);
    }
}
