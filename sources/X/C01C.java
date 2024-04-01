package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: X.01C */
/* loaded from: classes.dex */
public abstract class C01C {
    public static int A05;
    public static long A06;
    public static long A07;
    public static C03B A08;
    public static C03B A09;
    public static AnonymousClass039 A0A;
    public static AnonymousClass039 A0B;
    public static AnonymousClass039 A0C;
    public static AnonymousClass039 A0D;
    public static AnonymousClass039 A0E;
    public static AnonymousClass039 A0F;
    public static String A0G;
    public static String A0H;
    public static String A0I;
    public static ArrayList A0J;
    public static final C03B A0K;
    public static final C03B A0L;
    public static final C03B A0M;
    public static final C03B A0N;
    public static final C03B A0O;
    public static final C03B A0P;
    public static final C03B A0Q;
    public static final C03B A0R;
    public static final C03B A0S;
    public static final C03B A0T;
    public static final C03B A0U;
    public static final C03B A0V;
    public static final C03B A0W;
    public static final C03B A0X;
    public static final C03B A0Y;
    public static final C03B A0Z;
    public static final C03B A0a;
    public static final C03B A0b;
    public static final C03B A0c;
    public static final C03B A0d;
    public static final C03B A0e;
    public static final C03B A0f;
    public static final C03B A0g;
    public static final C03B A0h;
    public static final C03B A0i;
    public static final C03B A0j;
    public static final C03B A0k;
    public static final C03B A0l;
    public static final C03B A0m;
    public static final C03B A0n;
    public static final C03B A0o;
    public static final C03B A0p;
    public static final C03B A0q;
    public static final C03B A0r;
    public static final C03B A0s;
    public static final C03B A0t;
    public static final C03B A0u;
    public static final C03B A0v;
    public static final C03B A0w;
    public static final C03B A0x;
    public static final C03B A0y;
    public static final C03B A0z;
    public static final C03B A10;
    public static final C03B A11;
    public static final C03B A12;
    public static final C03B A13;
    public static final C03B A14;
    public static final C03B A15;
    public static final C03B A16;
    public static final C03B A17;
    public static final C03B A18;
    public static final C03B A19;
    public static final C03B A1A;
    public static final C03B A1B;
    public static final C03B A1C;
    public static final C03B A1D;
    public static final C03B A1E;
    public static final C03B A1F;
    public static final C03B A1G;
    public static final C03B A1H;
    public static final C03B A1I;
    public static final C03B A1J;
    public static final C03B A1K;
    public static final C03B A1L;
    public static final C03B A1M;
    public static final C03B A1N;
    public static final C03B A1O;
    public static final C03B A1P;
    public static final C03B A1Q;
    public static final C03B A1R;
    public static final C03B A1S;
    public static final C03B A1T;
    public static final C03B A1U;
    public static final C03B A1V;
    public static final C03B A1W;
    public static final C03B A1X;
    public static final C03B A1Y;
    public static final C03B A1Z;
    public static final C03B A1a;
    public static final C03B A1b;
    public static final C03B A1c;
    public static final C03B A1d;
    public static final C03B A1e;
    public static final C03B A1f;
    public static final C03B A1g;
    public static final C03B A1h;
    public static final C03B A1i;
    public static final C03B A1j;
    public static final C03B A1k;
    public static final C03B A1l;
    public static final C03B A1m;
    public static final C03B A1n;
    public static final C03B A1o;
    public static final C03B A1q;
    public static final C03B A1r;
    public static final C03B A1s;
    public static final C03B A1u;
    public static final C03B A1v;
    public static final C03B A1w;
    public static final C03B A1z;
    public static final C03B A20;
    public static final C03B A21;
    public static final C03B A22;
    public static final C03B A23;
    public static final C03B A24;
    public static final C03B A25;
    public static final C03B A26;
    public static final C03B A27;
    public static final C03B A28;
    public static final C03B A29;
    public static final C03B A2A;
    public static final C03B A2B;
    public static final C03B A2C;
    public static final C03B A2D;
    public static final C03B A2E;
    public static final C03B A2F;
    public static final C03B A2G;
    public static final C03B A2H;
    public static final C03B A2I;
    public static final C03B A2J;
    public static final C03B A2K;
    public static final C03B A2L;
    public static final C03B A2M;
    public static final C03B A2N;
    public static final C03B A2O;
    public static final C03B A2P;
    public static final C03B A2Q;
    public static final C03B A2R;
    public static final C03B A2S;
    public static final C03B A2T;
    public static final C03B A2U;
    public static final C03B A2V;
    public static final C03B A2W;
    public static final C03B A2X;
    public static final C03B A2Y;
    public static final C03B A2Z;
    public static final C03B A2a;
    public static final C03B A2b;
    public static final C03B A2c;
    public static final C03B A2d;
    public static final C03B A2e;
    public static final C03B A2f;
    public static final C03D A2g;
    public static final AnonymousClass039 A2h;
    public static final AnonymousClass039 A2i;
    public static final AnonymousClass039 A2j;
    public static final AnonymousClass039 A2k;
    public static final AnonymousClass039 A2m;
    public static final AnonymousClass039 A2n;
    public static final AnonymousClass039 A2p;
    public static final AnonymousClass039 A2r;
    public static final AnonymousClass039 A2s;
    public static final AnonymousClass039 A2t;
    public static final AnonymousClass039 A2u;
    public static final AnonymousClass039 A2v;
    public static final AnonymousClass039 A2x;
    public static final AnonymousClass039 A2y;
    public static final AnonymousClass039 A30;
    public static final AnonymousClass039 A31;
    public static final AnonymousClass039 A32;
    public static final AnonymousClass039 A33;
    public static final AnonymousClass039 A34;
    public static final AnonymousClass039 A35;
    public static final AnonymousClass039 A36;
    public static final AnonymousClass039 A37;
    public static final AnonymousClass039 A38;
    public static final AnonymousClass039 A39;
    public static final AnonymousClass039 A3D;
    public static final AnonymousClass039 A3E;
    public static final AnonymousClass039 A3F;
    public static final AnonymousClass039 A3G;
    public static final AnonymousClass039 A3H;
    public static final AnonymousClass039 A3I;
    public static final AnonymousClass039 A3J;
    public static final AnonymousClass039 A3K;
    public static final AnonymousClass039 A3L;
    public static final AnonymousClass039 A3Z;
    public static final AnonymousClass039 A3a;
    public static final AnonymousClass039 A3c;
    public static final AnonymousClass039 A3d;
    public static final AnonymousClass039 A3e;
    public static final AnonymousClass039 A3g;
    public static final AnonymousClass039 A3h;
    public static final AnonymousClass039 A3n;
    public static final AnonymousClass039 A3p;
    public static final AnonymousClass039 A3r;
    public static final AnonymousClass039 A3w;
    public static final AnonymousClass039 A3x;
    public static final AnonymousClass039 A40;
    public static final AnonymousClass039 A41;
    public static final AnonymousClass039 A42;
    public static final AnonymousClass039 A43;
    public static final AnonymousClass039 A44;
    public static final AnonymousClass039 A45;
    public static final AnonymousClass039 A46;
    public static final AnonymousClass039 A47;
    public static final AnonymousClass039 A48;
    public static final AnonymousClass039 A49;
    public static final AnonymousClass039 A4B;
    public static final C03C A4C;
    public static final C03C A4D;
    public static final C03C A4E;
    public static final C03C A4F;
    public final SharedPreferences A00;
    public final C03F A01;
    public final C03E A02;
    public final C001200o A03;
    public final C006202t A04;
    public static final List A4H = new ArrayList();
    public static final List A4G = new ArrayList();
    public static final AnonymousClass039 A3C = A02("image_quality", 80);
    public static final AnonymousClass039 A3A = A02("image_max_edge", 1600);
    public static final AnonymousClass039 A3Y = A03("media_limit_mb", "media", 16, 16, null);
    public static final AnonymousClass039 A3v = A02("status_image_quality", 50);
    public static final AnonymousClass039 A3u = A02("status_image_max_edge", 1280);
    public static final AnonymousClass039 A3z = A03("subject_length_limit", "max_subject", 25, 25, null);
    public static final AnonymousClass039 A2o = A03("broadcast_list_size_limit", "max_list_recipients", 256, 256, null);
    public static final AnonymousClass039 A3W = A03("media_limit_auto_download_mb", "media_max_autodownload", 32, 0, null);
    public static final AnonymousClass039 A3X = A03("media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100, null, null);
    public static final AnonymousClass039 A3B = A03("image_max_kbytes", "image_max_kbytes", 1024, 1024, null);
    public static final AnonymousClass039 A2w = A03("document_limit_mb", "file_max_size", 64, 64, null);
    public static final AnonymousClass039 A3y = A03("sticker_file_size_limit_kb", "sticker_file_size_limit_kb", 1024, 0, null);
    public static final AnonymousClass039 A3o = A03("prekey_expiration_days", "prekey_expiration_days", 60, 30, 180);
    public static final AnonymousClass039 A4A = A03("web_max_size_kb", "web_max_size_kb", 100, 0, 500);
    public static final AnonymousClass039 A3f = A03("participants_size_limit", "max_participants", 257, 257, null);
    public static final AnonymousClass039 A3R = A03("syncd_key_max_use_days", "syncd_key_max_use_days", 30, 1, 90);
    public static final AnonymousClass039 A3S = A03("syncd_key_stale_days", "syncd_key_stale_days", 31, 15, 90);
    public static final AnonymousClass039 A3V = A03("syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7, 1, 15);
    public static final AnonymousClass039 A3P = A03("syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100, 100, 2000);
    public static final AnonymousClass039 A3T = A03("syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10, 10, 100);
    public static final AnonymousClass039 A3M = A03("syncd_additional_mutations_for_key_catch_up", "syncd_additional_mutations_for_key_catch_up", 1, 1, 5);
    public static final AnonymousClass039 A3Q = A03("syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440, 0, 43200);
    public static final AnonymousClass039 A3O = A03("syncd_fatal_error_timeout_days", "syncd_fatal_error_timeout_days", 0, 0, 7);
    public static final AnonymousClass039 A3N = A03("syncd_critical_contacts_limit", "syncd_critical_contacts_limit", SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 100, 5000);
    public static final AnonymousClass039 A3U = A03("syncd_sentinel_timeout_seconds", "syncd_sentinel_timeout_seconds", 3, 0, 20);
    public static final AnonymousClass039 A2q = A02("max_keys", 812);
    public static final AnonymousClass039 A3q = A02("remove_old_chat_notifications", 1);
    public static final AnonymousClass039 A3b = A02("multicast_limit_global", 5);
    public static final AnonymousClass039 A3s = A02("sigquit_anr_detector_64bit_rollover_percent", 0);
    public static final AnonymousClass039 A3t = A02("sigquit_anr_detector_release_updated_rollout", 0);
    public static final AnonymousClass039 A2l = A02("anr_fast_logs_upload_rollout", 0);
    public static final AnonymousClass039 A2z = A03("fieldstats_beacon_chance", "fieldstats_beacon_chance", 0, 0, null);
    public static final C03B A1t = A01("payments_request_messages", "payments_request_messages", true);
    public static final AnonymousClass039 A3l = A02("payments_upi_transaction_limit", 5000);
    public static final C03B A1x = A01("payments_upi_settings_privacy_banner_enabled", "payments_upi_settings_privacy_banner_enabled", true);
    public static final C03B A1p = A01("payments_deeplink_signup_enabled", "payments_deeplink_signup_enabled", false);
    public static final AnonymousClass039 A3k = A02("payments_upi_intent_transaction_limit", 2000);
    public static final AnonymousClass039 A3i = A02("payments_upi_first_day_max_transaction_limit", 5000);
    public static final AnonymousClass039 A3j = A02("payments_upi_generate_qr_amount_limit", 5000);
    public static final AnonymousClass039 A3m = A02("payments_upi_transaction_limit_request", 5000);
    public static final C03B A1y = A01("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);

    static {
        A02("payments_mx_transaction_limit", 8000);
        A3h = A03("payments_br_transaction_limit", "payments_transaction_limit", SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, null, null);
        A3g = A02("pay_protocol_async_iq", 0);
        A3H = A02("max_receipt_processing_time", 5000);
        A0d = A01("db_write_to_old_schema_disabled", "db_write_to_old_schema_disabled", false);
        A2u = A02("db_receipt_migration_step", 3);
        A2t = A02("db_group_participant_migration_step", 2);
        A2v = A02("direct_db_migration_timeout_in_secs", 180);
        A3I = A02("md_mhfs_days", 732);
        A3L = A02("md_mhrs_days", 90);
        A3J = A02("md_mhfs_limit", 200);
        A31 = A02("frequently_forwarded_threshold", 5);
        A30 = A03("frequently_forwarded_max_chats", "frequently_forwarded_max", 1, null, null);
        A2r = A02("db_blank_me_jid_migration_step", 1);
        A2s = A02("db_broadcast_me_jid_migration_step", 2);
        A3r = A02("shops_required_tos_version", 0);
        A0t = A01("force_long_connect", "force_long_connect", false);
        A1N = A01("syncd_clear_chat_delete_chat_enabled", "syncd_clear_chat_delete_chat_enabled", false);
        A1M = A01("syncd_anti_tampering_fatal_exception_enabled", "syncd_anti_tampering_fatal_exception_enabled", false);
        A1O = A01("syncd_patch_device_index_included", "syncd_patch_device_index_included", false);
        A1H = A01("linked_devices_ui_enabled", "linked_devices_ui_enabled", false);
        A1G = A01("linked_devices_title_enabled", "linked_devices_title_enabled", false);
        A1F = A01("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
        A3G = A02("linked_devices_max_count", 4);
        A3K = A02("md_opt_in_experience", 0);
        A1P = A01("md_voip_enabled", "md_voip_enabled", false);
        A2a = A01("wam_real_time_enabled", "wam_real_time_enabled", true);
        A1h = A01("new_wam_runtime_enabled", "new_wam_runtime_enabled", true);
        A1q = A01("payments_disable_switch_psp", "payments_disable_switch_psp", false);
        A1o = A01("payments_cs_email_disabled", "payments_cs_email_disabled", false);
        A1r = A01("novi_p2p", "novi_p2p", false);
        A01("payments_indonesia_webview_access", "payments_indonesia_webview_access", false);
        A20 = A01("payment_history_fts_enabled", "payment_history_fts_enabled", false);
        A1s = A01("payments_upi_qr_scanning", "payments_upi_qr_scanning", false);
        A1w = A01("payments_upi_qr_signing", "payments_upi_qr_signing", false);
        A1z = A01("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
        A1u = A01("payments_upi_mandate_enabled", "payments_upi_mandate_enabled", false);
        A1v = A01("payments_upi_overdraft_account", "payments_upi_overdraft_account", false);
        A2d = A01("watls_prefer_ip6", "watls_prefer_ip6", false);
        A2b = A01("watls_enabled", "watls_enabled", false);
        A2c = A01("watls_no_dns", "watls_no_dns", false);
        A27 = A01("receipt_processing_dedup", "receipt_processing_dedup", true);
        A1K = A01("md_blocklist_v2", "md_blocklist_v2", false);
        A1L = A01("md_group_notification", "md_group_notification", false);
        A1S = A01("message_processing_dedup", "message_processing_dedup", false);
        A2V = A01("view_once_write", "view_once_write", false);
        A2U = A01("view_once_read", "view_once_read", false);
        A0N = A01("async_init_fts_migration", "async_init_fts_migration", false);
        A0O = A01("async_init_md_migrations", "async_init_md_migrations", true);
        C03C c03c = new C03C("payments_cs_faq_url", "https://faq.whatsapp.com/payments");
        A4H.add(c03c);
        A4E = c03c;
        C03C c03c2 = new C03C("payments_cs_email_address", null);
        A4H.add(c03c2);
        A4D = c03c2;
        C03C c03c3 = new C03C("payments_cs_phone_number", null);
        A4H.add(c03c3);
        A4F = c03c3;
        A2O = A01("storage_migration_enabled", "ssm_enabled", false);
        A48 = A02("wam_buffer_count", 2);
        A49 = A02("wam_realtime_buffer_count", 8);
        A1g = A01("new_animation_behavior", "new_animation_behavior", false);
        A29 = A01("recent_stickers_web_sync", "recent_stickers_web_sync", false);
        A2J = A01("starred_stickers_web_sync", "starred_stickers_web_sync", false);
        A01("third_party_animated_sticker", "third_party_animated_sticker", false);
        A2M = A01("stickers_animation_media", "stickers_animation_media", false);
        A2N = A01("sticker_notification_preview", "sticker_notification_preview", false);
        A2h = A02("animated_sticker_max_size_kb", 500);
        A2j = A02("animated_sticker_min_frame_duration_ms", 8);
        A2i = A02("animated_sticker_max_total_duration_ms", SearchActionVerificationClientService.NOTIFICATION_ID);
        A2Q = A01("template_hsm", "template_hsm", false);
        A1m = A01("packless_hsm", "packless_hsm", false);
        A0Y = A01("catalog_message", "catalog_message", false);
        A0v = A01("frequently_forwarded_messages", "frequently_forwarded_messages", false);
        A0u = A01("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
        A1f = A01("mute_always", "mute_always", false);
        A0j = A01("enhanced_archive", "enhanced_archive", false);
        A0n = A01("ephemeral_messages_enabled", "ephemeral_messages_enabled", true);
        A0o = A01("ephemeral_messages_setting", "ephemeral_messages_setting", false);
        A0p = A01("ephemeral_pruning_enabled", "ephemeral_pruning_enabled", true);
        C03C c03c4 = new C03C("ephemeral_messages_allowed_values", "604800");
        A4H.add(c03c4);
        A4C = c03c4;
        A2x = A02("ephemeral_drop_column_stage", 0);
        A2y = A02("ephemeral_group_query_ts", 0);
        A1b = A01("mms_resume_check_chatd", "mms_resume_check_chatd", false);
        A1a = A01("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
        A1X = A01("mms_cat_v1_forward_hot_override_enabled", "mms_cat_v1_forward_hot_override_enabled", true);
        A1Y = A01("mms_chatd_resume_check_over_thrift_enabled", "mms_chatd_resume_check_over_thrift", true);
        A1W = A01("mms4_server_error_receipt_encryption_enabled", "mms4_server_error_receipt_encryption_enabled", false);
        A1V = A01("mms4_media_retry_notification_encryption_enabled", "mms4_media_retry_notification_encryption_enabled", false);
        A1U = A01("mms4_media_conn_persist_enabled", "mms4_media_conn_persist_enabled", false);
        A1c = A01("mms_vcache_aggregation_enabled", "mms_vcache_aggregation_enabled", false);
        A3a = A02("mms_vcard_autodownload_size_kb", 1024);
        A3Z = A03("mms_hot_content_time_span", "mms_hot_content_timespan_in_seconds", 0, null, null);
        A19 = A01("hq_image_enabled", "hq_image_enabled", false);
        A38 = A02("hq_image_max_edge", 0);
        A39 = A02("hq_image_quality", 0);
        A37 = A02("hq_image_bw_threshold", 75);
        A1n = A01("partial_pjpeg_enabled", "partial_pjpeg_enabled", true);
        A3e = A02("partial_pjpeg_bw_threshold", 125);
        A0P = A01("attachment_picker_refresh", "attachment_picker_refresh", false);
        A2p = A02("biz_profile_options", 4);
        A0Q = A01("audio_data_for_notification", "audio_data_for_notification", true);
        A0U = A01("bloks_shops_enabled", "bloks_shops_enabled", false);
        A01("bloks_rendercore_enabled", "bloks_rendercore_enabled", false);
        A0S = A01("bloks_cache_enabled", "bloks_cache_enabled", false);
        A01("bloks_http_enabled", "bloks_http_enabled", false);
        A0T = A01("bloks_minification_enabled", "bloks_minification_enabled", false);
        A1R = A01("media_quick_edit", "media_quick_edit", false);
        A01("stringpacks_mmap_enabled", "stringpacks_mmap_enabled", false);
        A28 = A01("receipt_processing_thread", "receipt_processing_thread", false);
        A0R = A01("authkey_reset_on_ban", "authkey_reset_on_ban", false);
        A32 = A02("gif_provider", -1);
        A2I = A01("starred_gifs", "starred_gifs", false);
        A0w = A01("gif_search_v2", "gif_search_v2", false);
        A46 = A02("video_max_bitrate", 5000);
        A3w = A02("status_video_max_duration", 45);
        A2L = A01("stella_interop_enabled", "stella_interop_enabled", false);
        A3x = A03("stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10, 0, 20);
        A0m = A01("entry_point_block_logging_enabled", "entry_point_block_logging_enabled", false);
        A0s = A01("fbns_enabled", "fbns_enabled", false);
        A0b = A01("ctwa_context_enabled", "ctwa_context_enabled", false);
        A0c = A01("ctwa_context_enterprise_enabled", "ctwa_context_enterprise_enabled", false);
        A01("calls_row_constraint_layout", "calls_row_constraint_layout", false);
        A1i = A01("notif_ch_override_off", "notif_ch_override_off", false);
        A0l = A01("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
        A1Z = A01("mms_download_nc_cat", "mms_download_nc_cat", false);
        A0e = A01("deep_link_redirect_enable", "deep_link_redirect_enable", false);
        A35 = A02("group_description_length", 0);
        A0z = A01("groups_v3", "groups_v3", false);
        A10 = A01("group_call_discoverability_enabled", "group_call_discoverability_enabled", false);
        A0r = A01("fan_out_group_call_enabled", "fan_out_group_call_enabled", false);
        A3c = A02("one_tap_calling_in_group_chat_size", 4);
        A13 = A01("group_join_permissions", "group_join_permissions", false);
        A12 = A01("group_invite_sending", "group_invite_sending", false);
        A15 = A01("group_qr_codes_enabled", "group_qr_codes_enabled", false);
        A0y = A01("groups_privacy_blacklist", "groups_privacy_blacklist", false);
        A16 = A01("grp_uii_cleanup", "grp_uii_cleanup", false);
        A2D = A01("search_in_storage_usage", "search_in_storage_usage", false);
        A2C = A01("search_by_image", "search_by_image_enabled", false);
        A26 = A01("quick_message_search_enabled", "quick_message_search_enabled", false);
        A0h = A01("emoji_search_unreleased_languages", "emoji_search_unreleased_languages", false);
        A0K = A01("add_contact_by_qr_enabled", "add_contact_by_qr_enabled", false);
        A1T = A01("message_qr_enabled", "message_qr_enabled", false);
        A25 = A01("qr_scanning", "qr_scanning", false);
        A01("message_qr_disambiguation_enabled", "message_qr_disambiguation_enabled", false);
        A36 = A03("heartbeat_interval_seconds", "heartbeat_interval", 86400, null, null);
        A3n = A02("ping_timeout_s", 32);
        A1l = A01("p2p_pay", "p2p_pay", false);
        A1k = A01("p2m_pay", "p2m_pay", false);
        A0x = A01("google_drive_enabled", "google_drive_enabled", true);
        A2k = A02("announcement_toggle_time_hours", 72);
        A0V = A01("broadcast_noncontacts", "broadcast_noncontacts", false);
        A23 = A01("profilo_enabled", "profilo_enabled", false);
        A17 = A01("disable_hfm_autodownload", "disable_hfm_autodownload", false);
        A18 = A01("hfm_string_changes", "hfm_string_changes", false);
        A41 = A03("template_doc_mime_types_int", "template_doc_mime_types", 0, null, null);
        A2A = A01("reg_log_advertiser_id", "reg_log_advertiser_id", false);
        A21 = A01("portal_optimization_enabled", "p_opt", false);
        A2K = A01("status_collapse_muted", "status_collapse_muted", false);
        A0f = A01("delete_bad_gcm_token", "delete_bad_gcm_token", false);
        C03B c03b = new C03B("enable_export", "enable_export", true);
        A4G.add(c03b);
        A0q = c03b;
        C03B c03b2 = new C03B("in_app_notification_chat_list", "in_app_notification_chat_list", false);
        A4G.add(c03b2);
        A1C = c03b2;
        A0M = A01("anr_process_monitor", "anr_process_monitor", false);
        A1B = A01("invites_logging_enabled", "invites_logging_enabled", false);
        A0L = A01("add_contact_logging_enabled", "add_contact_logging_enabled", false);
        A2m = A03("async_fast_forward_ttl", "mms_async_fast_forward_ttl", 432000, null, null);
        A0g = A01("disable_prewarm", "disable_prewarm", false);
        A2R = A01("thread_dump_contact_support", "thread_dump_contact_support", false);
        A4B = A02("web_service_delay", 120);
        A2S = A01("track_battery_metrics", "track_battery_metrics", false);
        C03D c03d = new C03D();
        A4H.add(c03d);
        A2g = c03d;
        A2B = A01("reset_skey_on_id_change", "reset_skey_on_id_change", false);
        A1J = A01("local_backup_in_service", "local_backup_in_service", true);
        A0i = A01("enable_backup_passive_mode", "enable_backup_passive_mode", true);
        A40 = A02("sync_wifi_threshold_kb", 5000);
        A01("disk_footprint_logging", "disk_footprint_logging", false);
        A2F = A01("shape_picker_v2_enabled", "shape_picker_v2_enabled", false);
        A2E = A01("shape_picker_png_emojis_enabled", "shape_picker_png_emojis_enabled", false);
        A01("camelot", "camelot", false);
        A01("roundtable", "roundtable", false);
        A42 = A02("tintagel", 264);
        A01("room_messenger_upgrade", "room_messenger_upgrade", false);
        A0Z = A01("consumer_content_provider", "consumer_content_provider", true);
        A0a = A01("consumer_rc_provider", "consumer_rc_provider", false);
        A2W = A01("wallpapers_v2", "wallpapers_v2", false);
        A2H = A01("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
        A2G = A01("share_biz_vcard_enabled", "share_biz_vcard_enabled", false);
        A01("business_profile_updated_ui", "business_profile_updated_ui", false);
        A01("business_profile_c2e", "business_profile_c2e", false);
        A0k = A01("enhanced_block_enabled", "enhanced_block_enabled", false);
        A2n = A02("biz_block_reasons_version", 0);
        A47 = A02("vname_cert_staleness_threshold", 43200);
        A1Q = A01("media_files_deduplication", "media_files_deduplication", false);
        A3d = A03("overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0, 0, 300);
        A1I = A01("list_message_reception_disabled", "list_message_reception_disabled", false);
        A0W = A01("bsp_system_message_enabled", "bsp_system_message_enabled", false);
        A0X = A01("bsp_ui", "bsp_ui", false);
        A1j = A01("optimistic_image_processing_enabled", "optimistic_image_processing_enabled", false);
        A1e = A01("multi_share_file_preview", "multi_share_file_preview", false);
        A1d = A01("move_media_folder_from_sister_app", "move_media_folder_from_sister_app", false);
        A22 = A01("product_media_attachments", "product_media_attachments", false);
        A43 = A02("use_downloadable_emoji_int", 0);
        A24 = A01("ptt_playback_speed_enabled", "ptt_playback_speed_enabled", false);
        A3p = A02("ptt_playback_speed_hide_delay", 1500);
        A44 = A02("vcard_as_document_size_kb", 0);
        A45 = A02("vcard_max_size_kb", 1024);
        A1A = A01("instrument_spam_report_enabled", "instrument_spam_report_enabled", true);
        A2P = A01("suspicious_links", "suspicious_links", false);
        A2Z = A01("wamsys_mms_enabled", "wamsys_mms_enabled", false);
        A2X = A01("wa_msys_crypto", "wa_msys_crypto", false);
        A2Y = A01("wa_msys_fingerprint", "wa_msys_fingerprint", false);
        A34 = A02("group_call_max_participants", 4);
        A11 = A01("group_call_video_maximization_enabled", "group_call_video_maximization_enabled", false);
        A3E = A02("joinable_group_call_client_version", 0);
        A3F = A02("joinable_group_call_version", 0);
        A1E = A01("inline_joinable_education_enabled", "inline_joinable_education_enabled", false);
        A33 = A02("group_call_callee_ring_duration", 23);
        A1D = A01("joinable_duplicate_participants_fix_enabled", "joinable_duplicate_participants_fix_enabled", false);
        A3D = A02("group_call_client_polling_interval_min", 0);
        A09 = A01("wam_privatestats_enabled", "wam_privatestats_enabled", false);
        A0D = A03("privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 48, 2, Integer.MAX_VALUE);
        A0C = A03("privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200, 1, 43200);
        A0B = A03("privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400, 43200, Integer.MAX_VALUE);
        A0A = A03("privatestats_token_first_delay_seconds", "privatestats_token_first_delay_seconds", 21600, Integer.valueOf((int) EditorInfoCompat.IME_FLAG_FORCE_ASCII), 172800);
        A0E = A03("privatestats_upload_jitter_secs", "privatestats_upload_jitter_secs", 35, 0, 150);
        A0F = A03("storage_mgmt_banner_threshold_mb", "storage_mgmt_banner_threshold_mb", 200, 0, Integer.valueOf((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        A2T = A01("user_notice", "user_notice", false);
        A08 = A01("biz_transitions", "biz_transitions", false);
        A14 = A01("group_message_notification_use_jid_instead_of_from_me", "group_message_notification_use_jid_instead_of_from_me", true);
        A2e = A01("webpage_thumbnail_allow_small", "webpage_thumbnail_allow_small", false);
        A2f = A01("webpage_thumbnail_retry_small", "webpage_thumbnail_retry_small", false);
    }

    public C01C(C001200o c001200o, C03E c03e, C006202t c006202t, C03F c03f, C02O c02o) {
        this.A03 = c001200o;
        this.A02 = c03e;
        this.A04 = c006202t;
        this.A00 = c02o.A02(C02M.A02);
        this.A01 = c03f;
        synchronized (C01C.class) {
            A05 = this.A00.getInt("server_props:last_version", 0);
            A07 = this.A00.getLong("groups_server_props_last_refresh_time", 0L);
            A0H = this.A00.getString("server_props:config_hash", null);
            A0G = this.A00.getString("server_props:config_key", null);
            A06 = this.A00.getLong("server_props:refresh", 86400000L);
            A0J = A04(this.A00.getString("tos_update_v2", null));
            A0I = this.A00.getString("tos_update_v2_version", null);
        }
    }

    public static C03B A01(String str, String str2, boolean z) {
        C03B c03b = new C03B(str, str2, z);
        A4H.add(c03b);
        return c03b;
    }

    public static AnonymousClass039 A02(String str, int i) {
        return A03(str, str, i, null, null);
    }

    public static AnonymousClass039 A03(String str, String str2, int i, Integer num, Integer num2) {
        AnonymousClass039 anonymousClass039 = new AnonymousClass039(str, str2, i, num, num2);
        A4H.add(anonymousClass039);
        return anonymousClass039;
    }

    public static final ArrayList A04(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            for (String str2 : str.split("-")) {
                arrayList.add(Long.valueOf(Integer.parseInt(str2) * 3600000));
            }
        } catch (NumberFormatException e) {
            arrayList.clear();
            StringBuilder sb = new StringBuilder("serverprops/onServerProperties/format error ");
            sb.append(str);
            Log.e(sb.toString(), e);
        }
        return arrayList;
    }

    public static boolean A05() {
        boolean z;
        synchronized (C01C.class) {
            z = A0J.isEmpty() ? false : true;
        }
        return z;
    }

    public int A06() {
        return A07(A3f) - 1;
    }

    public int A07(AnonymousClass039 anonymousClass039) {
        int i;
        synchronized (C01C.class) {
            i = this.A00.getInt(A09(anonymousClass039), anonymousClass039.A00);
        }
        return i;
    }

    public long A08(int i) {
        synchronized (C01C.class) {
            ArrayList arrayList = A0J;
            if (arrayList.size() < i) {
                StringBuilder sb = new StringBuilder();
                sb.append("serverprops/gettosstage/index ");
                sb.append(i);
                sb.append(" ");
                sb.append(this.A00.getString("tos_update_v2", null));
                sb.append(" length:");
                sb.append(A0J.size());
                Log.e(sb.toString());
                return 0L;
            }
            return ((Long) arrayList.get(i - 1)).longValue();
        }
    }

    public final String A09(C03A c03a) {
        return c03a.A00;
    }

    public String A0A(C03C c03c) {
        String string;
        synchronized (C01C.class) {
            string = this.A00.getString(A09(c03c), c03c.A00);
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x014f A[Catch: all -> 0x0199, TRY_ENTER, TryCatch #3 {, blocks: (B:92:0x0009, B:94:0x002c, B:121:0x00a3, B:123:0x00b5, B:124:0x00ba, B:146:0x014f, B:148:0x015c, B:150:0x0170, B:151:0x0172, B:155:0x0181, B:161:0x0188, B:162:0x018b, B:163:0x018e, B:125:0x00c2, B:96:0x0032, B:97:0x003d, B:99:0x0043, B:100:0x004d, B:101:0x0057, B:104:0x0064, B:106:0x006e, B:107:0x0072, B:108:0x0073, B:110:0x007e, B:111:0x0084, B:113:0x008a, B:114:0x0094, B:152:0x0173, B:126:0x00d3, B:130:0x00e6, B:131:0x00eb, B:133:0x00fa, B:135:0x0107, B:137:0x0130, B:140:0x0142, B:138:0x0138, B:129:0x00e0, B:102:0x0058, B:103:0x0063), top: B:172:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0170 A[Catch: all -> 0x0199, TryCatch #3 {, blocks: (B:92:0x0009, B:94:0x002c, B:121:0x00a3, B:123:0x00b5, B:124:0x00ba, B:146:0x014f, B:148:0x015c, B:150:0x0170, B:151:0x0172, B:155:0x0181, B:161:0x0188, B:162:0x018b, B:163:0x018e, B:125:0x00c2, B:96:0x0032, B:97:0x003d, B:99:0x0043, B:100:0x004d, B:101:0x0057, B:104:0x0064, B:106:0x006e, B:107:0x0072, B:108:0x0073, B:110:0x007e, B:111:0x0084, B:113:0x008a, B:114:0x0094, B:152:0x0173, B:126:0x00d3, B:130:0x00e6, B:131:0x00eb, B:133:0x00fa, B:135:0x0107, B:137:0x0130, B:140:0x0142, B:138:0x0138, B:129:0x00e0, B:102:0x0058, B:103:0x0063), top: B:172:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(X.AnonymousClass012 r11, X.C04930Mn r12, int r13, java.util.Map r14, int r15, java.lang.String r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01C.A0B(X.012, X.0Mn, int, java.util.Map, int, java.lang.String, java.lang.String, long):void");
    }

    public boolean A0C() {
        return A0E(A0n) && A0E(A0o);
    }

    public boolean A0D() {
        boolean z;
        synchronized (C01C.class) {
            z = new Random().nextInt(100) + 1 <= A07(A3t);
        }
        return z;
    }

    public boolean A0E(C03B c03b) {
        boolean z;
        synchronized (C01C.class) {
            z = this.A00.getBoolean(A09(c03b), c03b.A00);
        }
        return z;
    }
}
