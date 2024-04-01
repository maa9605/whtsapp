package com.whatsapp;

import X.AbstractActivityC06510Tq;
import X.C0CC;
import X.C49562Lc;
import X.InterfaceC05620Pl;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockingUserInteractionActivity;
import com.whatsapp.InsufficientStorageSpaceActivity;

/* loaded from: classes.dex */
public class BlockingUserInteractionActivity extends AbstractActivityC06510Tq {
    public C0CC A00;
    public C49562Lc A01;

    @Override // X.AbstractActivityC06510Tq, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView(R.layout.activity_blocking_user_interactions);
            C0CC c0cc = this.A00;
            c0cc.A03.A05(this, new InterfaceC05620Pl() { // from class: X.1h1
                {
                    BlockingUserInteractionActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    BlockingUserInteractionActivity blockingUserInteractionActivity = BlockingUserInteractionActivity.this;
                    if (Boolean.FALSE.equals(obj)) {
                        blockingUserInteractionActivity.finish();
                        blockingUserInteractionActivity.startActivity((Intent) blockingUserInteractionActivity.getIntent().getParcelableExtra("original_intent"));
                        blockingUserInteractionActivity.overridePendingTransition(0, 0);
                    }
                }
            });
        } else if (intExtra != 1) {
        } else {
            setTitle(R.string.msg_store_migrate_title);
            setContentView(R.layout.activity_forced_migration_blocking_user_interactions);
            C49562Lc c49562Lc = this.A01;
            c49562Lc.A00.A05(this, new InterfaceC05620Pl() { // from class: X.1h2
                {
                    BlockingUserInteractionActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    BlockingUserInteractionActivity blockingUserInteractionActivity = BlockingUserInteractionActivity.this;
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 5 && intValue != 2 && intValue != 0) {
                        if (intValue == 4) {
                            blockingUserInteractionActivity.setContentView(R.layout.activity_forced_migration_failed);
                            return;
                        } else if (intValue != 3) {
                            return;
                        } else {
                            blockingUserInteractionActivity.setContentView(R.layout.activity_forced_migration_failed);
                            blockingUserInteractionActivity.startActivity(new Intent(blockingUserInteractionActivity, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra("allowSkipKey", false).putExtra("spaceNeededInBytes", 10485760L));
                            return;
                        }
                    }
                    blockingUserInteractionActivity.finish();
                    blockingUserInteractionActivity.startActivity((Intent) blockingUserInteractionActivity.getIntent().getParcelableExtra("original_intent"));
                    blockingUserInteractionActivity.overridePendingTransition(0, 0);
                }
            });
        }
    }
}
