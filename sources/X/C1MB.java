package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import java.util.WeakHashMap;

/* renamed from: X.1MB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1MB extends AbstractC38501oG implements View.OnClickListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    @Override // X.C1TS, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public C1MB(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.A0T);
        this.A03 = 1;
        this.A04 = -1;
        this.A05 = -1;
        this.A06 = -1;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = -1;
        ((C1TS) this).A01.getSystemService("search");
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    public static String A00(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // X.C1TS
    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = ((AbstractC38501oG) this).A02.inflate(((AbstractC38501oG) this).A01, viewGroup, false);
        inflate.setTag(new C11470ho(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.A08);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1TS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(android.view.View r24, android.content.Context r25, android.database.Cursor r26) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1MB.A04(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable A05(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1MB.A05(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // X.C1TS, X.InterfaceC13360l8
    public void A62(Cursor cursor) {
        try {
            Cursor A00 = A00(cursor);
            if (A00 != null) {
                A00.close();
            }
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // X.C1TS, X.InterfaceC13360l8
    public CharSequence A6Z(Cursor cursor) {
        String A00;
        String A002;
        if (cursor == null) {
            return null;
        }
        String A003 = A00(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (A003 != null) {
            return A003;
        }
        SearchableInfo searchableInfo = this.A09;
        if (!searchableInfo.shouldRewriteQueryFromData() || (A002 = A00(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!searchableInfo.shouldRewriteQueryFromText() || (A00 = A00(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return A00;
        }
        return A002;
    }

    @Override // X.C1TS, X.InterfaceC13360l8
    public Cursor AS6(CharSequence charSequence) {
        Cursor query;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.A0B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = this.A09;
                String[] strArr = null;
                if (searchableInfo != null) {
                    String suggestAuthority = searchableInfo.getSuggestAuthority();
                    if (suggestAuthority == null) {
                        query = null;
                    } else {
                        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                        String suggestPath = searchableInfo.getSuggestPath();
                        if (suggestPath != null) {
                            fragment.appendEncodedPath(suggestPath);
                        }
                        fragment.appendPath("search_suggest_query");
                        String suggestSelection = searchableInfo.getSuggestSelection();
                        if (suggestSelection != null) {
                            strArr = new String[]{charSequence2};
                        } else {
                            fragment.appendPath(charSequence2);
                        }
                        fragment.appendQueryParameter("limit", String.valueOf(50));
                        query = ((C1TS) this).A01.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
                    }
                } else {
                    query = null;
                }
                if (query != null) {
                    query.getCount();
                    return query;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // X.C1TS, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = ((AbstractC38501oG) this).A02.inflate(((AbstractC38501oG) this).A00, viewGroup, false);
            if (inflate != null) {
                ((C11470ho) inflate.getTag()).A03.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // X.C1TS, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A03 = A03(((C1TS) this).A01, ((C1TS) this).A02, viewGroup);
            ((C11470ho) A03.getTag()).A03.setText(e.toString());
            return A03;
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = ((C1TS) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = ((C1TS) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0G((CharSequence) tag);
        }
    }
}
