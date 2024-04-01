package com.whatsapp.support;

import X.C2QH;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class Remove extends C2QH {
    @Override // X.C2QH, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.title_remove);
        Intent intent = new Intent();
        intent.putExtra("is_removed", true);
        setResult(-1, intent);
        finish();
    }
}
