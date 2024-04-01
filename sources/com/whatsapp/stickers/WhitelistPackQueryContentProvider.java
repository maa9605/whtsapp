package com.whatsapp.stickers;

import X.AbstractC40391s9;
import X.AnonymousClass029;
import X.C000200d;
import X.C0C5;
import X.C40401sA;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class WhitelistPackQueryContentProvider extends AbstractC40391s9 {
    public UriMatcher A00;
    public C40401sA A01;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return C000200d.A0J("vnd.android.cursor.item/vnd.", "com.whatsapp.provider.sticker_whitelist_check", ".", "is_whitelisted");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        UriMatcher uriMatcher;
        ProviderInfo resolveContentProvider;
        String nameForUid;
        if (this.A01 == null) {
            this.A01 = ((C0C5) AnonymousClass029.A0X(getContext().getApplicationContext())).A1f();
        }
        try {
            synchronized (this) {
                if (this.A00 == null) {
                    UriMatcher uriMatcher2 = new UriMatcher(-1);
                    this.A00 = uriMatcher2;
                    uriMatcher2.addURI("com.whatsapp.provider.sticker_whitelist_check", "is_whitelisted", 1);
                }
                uriMatcher = this.A00;
            }
            if (uriMatcher.match(uri) == 1 && getContext() != null) {
                PackageManager packageManager = getContext().getPackageManager();
                String queryParameter = uri.getQueryParameter("authority");
                String queryParameter2 = uri.getQueryParameter("identifier");
                if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2) || (resolveContentProvider = packageManager.resolveContentProvider(queryParameter, 128)) == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    nameForUid = getCallingPackage();
                } else {
                    nameForUid = packageManager.getNameForUid(Binder.getCallingUid());
                }
                if (nameForUid != null && nameForUid.equals(resolveContentProvider.packageName)) {
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"result"});
                    matrixCursor.newRow().add(Integer.valueOf(this.A01.A03(queryParameter, queryParameter2) ? 1 : 0));
                    return matrixCursor;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("the calling package ");
                sb.append(nameForUid);
                sb.append(" does not own the queried authority: ");
                sb.append(queryParameter);
                Log.w(sb.toString());
            }
            return null;
        } catch (Exception e) {
            Log.e("Exception when querying whitelist packs", e);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
