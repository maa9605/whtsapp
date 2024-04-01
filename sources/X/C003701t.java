package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.01t */
/* loaded from: classes.dex */
public class C003701t {
    public static final AnonymousClass036 A0k;
    public static volatile C003701t A0l;
    public final SharedPreferences A0N;
    public final AnonymousClass037 A0O;
    public final C006202t A0P;
    public final InterfaceC002901k A0Q;
    public final int A01 = 400;
    public final boolean A0c = true;
    public final int A0E = 200;
    public final int A0D = 400;
    public final int A0M = -1;
    public final int A07 = -1;
    public final int A03 = 812;
    public final int A0L = 5000;
    public final int A05 = 100;
    public final int A04 = 32;
    public final int A0K = 45;
    public final String A0W = "none";
    public final String A0U = "all";
    public final String A0V = "none";
    public final String A0S = "none";
    public final String A0T = "none";
    public final String A0a = "";
    public final int A06 = 3;
    public final boolean A0i = true;
    public final int A09 = 30;
    public final boolean A0e = true;
    public final boolean A0h = true;
    public final int A0I = 4;
    public final int A0G = 2;
    public final int A0H = 1;
    public final int A0F = 2;
    public final int A0J = 4;
    public final int A0B = 1024;
    public final int A0A = 5;
    public final int A0C = 1440;
    public final String A0X = "json:{\"sampling\":[]}";
    public final int A02 = 60;
    public final int A00 = -1;
    public final boolean A0g = true;
    public final boolean A0f = true;
    public final String A0R = "AppMessagingXmppHandler/onLogNotification:1;WhatsAppLibLoader/loadStartupLibs:1;AbstractAppShell/maybeReportDecompressionFailure:1;";
    public final boolean A0d = true;
    public final int A08 = 7;
    public final String A0Y = "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}";
    public final String A0Z = "{\"sampling\":[]}";
    public volatile Boolean A0j = null;
    public final Set A0b = new HashSet();

    static {
        List asList = Arrays.asList("disable_prewarm", "scroll_perf", "progressive_jpeg_thumbnail_enabled", "reusable_video_player_enabled", "buffer_for_playback", "watls_enabled", "watls_no_dns", "watls_prefer_ip6", "watls_early_data", "watls_enable_early_data_http_post", "watls_enable_early_data_http_get", "media_autodownload_thread_pool_size", "autodownload_priority_policy", "offline_text_color_change", "mms_tcp_congestion_bbr", "camelot", "roundtable", "room_messenger_upgrade", "whats_my_number_enabled", "sms_retriever_first", "offline_aa_test_config", "offline_aa_test_config_v2", "consumer_reg_profile_design", "status_fast_streaming_enable_test", "status_fast_streaming_initial_buffering_second_test", "status_fast_streaming_unstall_second_test", "status_fast_streaming_unstall_multiplier_test", "status_aggressive_prefetch_seconds", "image_max_edge_test", "status_image_max_edge_test", "image_compression_quality_test", "status_image_compression_quality_test", "image_quality_group", "stream_progressive_jpeg_enabled", "liger_enabled", "liger_quic_enabled", "mms4_pps_download_thumbnail", "mms4_pps_download_full_size", "pjeg_data_saver_enabled", "pjpeg_status_data_saver_enabled", "pjpeg_chat_data_saver_enabled", "download_full_pjpeg_max_edge", "download_full_pjpeg_max_edge_status", "higher_image_max_edge", "higher_image_max_edge_status", "image_max_kb_for_skipping_compression", "higher_image_quality", "higher_image_quality_status", "new_wam_runtime_enabled", "new_wam_runtime_beaconing", "status_collapse_muted", "photo_upload_bandwidth_estimation_enabled", "photo_download_bandwidth_estimation_enabled", "pjpeg_force_download_mid_quality_enabled", "dns_over_https_enabled", "dns_over_https_interleave_enabled", "camera_core_integration_enabled", "bandwidth_estimation_algorithm", "bandwidth_estimation_adjacent_hours_optimization", "lazy_camera_view_inflation", "sender_higher_quality_bandwidth_threshold", "receiver_higher_quality_bandwidth_threshold", "photo_download_realtime_bandwidth_enabled", "wamsys_registration_enabled", "wamsys_registration_value", "wamsys_registration_v3_enabled", "wamsys_registration_v4_enabled", "wamsys_registration_v5_enabled", "wamsys_registration_v6_enabled", "mms_chatd_resume_check_override", "disable_status_autodownload_inactive_users", "auto_expo_int_field", "auto_expo_status_tab_open", "wamsys_mms_enabled", "mms_media_conn_persist_enabled", "mms_media_conn_foreground_only_enabled", "android_camera2_support_level", "connect_with_friends_dialog_enabled", "max_keys", "video_max_bitrate", "work_manager_hourly_cron", "work_manager_ntp_sync", "media_max_autodownload_wifi_mb", "media_max_autodownload", "status_video_max_duration", "voip_fix_converter_memory_leak", "enable_non_wake_up_alarm_ping", "async_init_after_thread_idle", "wamsys_decryption_individual_enabled", "wamsys_encryption_individual_enabled", "wamsys_decryption_group_enabled", "wamsys_encryption_group_enabled", "android_test_scheduler_api", "android_test_scheduler_period_impl", "android_test_scheduler_period_hours", "android_test_scheduler_run_seconds", "transsion_badging", "enable_hash_based_hybrid_codecs_mask", "upload_thread_lower_priority", "async_data_load_on_startup", "enable_long_running_job_monitor", "bloks_use_minscript_android", "bloks_anonymous_access_app_id", "bloks_loggedin_access_app_id", "bloks_loggedin_employee_or_tester_access_app_id", "load_chats_lazily", "status_ranking", "db_migration_low_latency_kill_switch_latency", "db_migration_low_latency_kill_switch", "db_migration_low_latency_kill_switch_experiment", "db_migration_data_source_v1", "db_migration_data_source_v2", "db_migration_level_reset", "db_migration_level_keep", "db_migration_level_migrate", "db_migration_level_force", "db_migration_level_force_blocked", "db_migration_consistency_check_daily", "db_migration_consistency_check_startup", "db_migration_min_disk_size", "db_migration_max_db_size", "db_verification_controls", "shops_pdp_urls_config", "shops_storefront_native_entrypoint_enabled", "shops_storefront_icon_and_preview_entrypoints_enabled", "biz_profile_options_new", "wallpapers_v2", "low_space_threshold", "video_transcode_retry_enabled", "video_transcode_fallback_enabled", "dedupe_transcode_images", "dedupe_transcode_videos", "dedupe_transcode_shared_images", "dedupe_transcode_shared_videos", "dedupe_transcode_gif", "dedupe_transcode_audio", "in_app_support_v2_enabled", "in_app_support_v2_locale_langs", "in_app_support_v2_numbers", "disable_new_sticker_animation", "enable_mmap_stringpacks", "new_sticker_animation_behavior_v2", "disable_privatestats_battery", "remove_geolocation_videos", "sticker_search_enabled", "status_sticker_search_enabled", "enable_privatestats", "upload_status_thumb_mms_enabled", "upload_document_thumb_mms_enabled", "upload_link_thumb_mms_enabled", "download_status_thumb_mms_enabled", "download_document_thumb_mms_enabled", "download_link_thumb_mms_enabled", "send_status_thumb_in_message_disabled", "send_document_thumb_in_message_disabled", "send_link_thumb_in_message_disabled", "animated_stickers_thread_clean_up", "media_upload_aggressive_retry_enabled", "media_upload_aggressive_retry_exponential_backoff_enabled", "media_upload_max_aggressive_retries", "pen_smoothing_enabled", "status_grid_enabled", "pencil_ui_enhancements_wave_1_enabled", "enable_catalogs_carts", "shops_storefront_urls_config", "app_locked_with_biometrics", "android_media_use_fresco_for_gifs", "sticker_tray_animation_finite_loops", "sticker_tray_animation_first_row", "sticker_tray_animation_fully_visible_items", "sticker_picker_animated_sticker_shrinking", "android_push_notify_fg_service", "group_chat_message_push_priority_obfuscation_percent", "android_push_config_muted_chats", "android_muted_group_chats_for_message", "third_party_animated_sticker_import", "sticker_contextual_suggestion_enabled", "disable_third_party_animated_sticker_animation", "sticker_pack_deeplink_enabled", "yt_video_preview", "android_us_language_selector", "stanza_processing_logging_enabled", "privatestats_upload_jitter_secs", "payments_bloks_rendercore_enabled", "groups_dogfooding_ui", "md_icdc_enabled", "md_icdc_hash_length", "disable_buttons_message", "disable_novi_hub_nfm", "mute_video", "new_user_location_dialogs_enabled", "use_compressed_packfile", "user_notice_clear", "groups_banner_conversations_count", "groups_banner_consecutive_days_count", "groups_banner_total_days_count", "groups_banner_max_clicks", "groups_banner_max_dismisses", "enable_cart_v1_1_business_actions", "played_self_enabled", "important_messages", "product_catalog_hide_show_items_enabled", "ephemeral_media_private", "ephemeral_24h_duration", "catalog_cart_on_off_enabled", "enable_cup_phone", "conversation_async_view_inflation_enabled", "conversation_warming_enabled", "report_disk_event", "quoted_order_message_tables_migration_enabled", "conversation_media_preview_v2", "suspicious_chats_privacy_upsell_banner", "software_transcoder_as_last_resort", "payments_upi_new_invite_flow_enabled", "sad_rate_attribution_scorecard_logging", "android_message_logout_timeout_minutes", "ephemeral_allow_group_members", "is_user_under_epd_jurisdiction", "ptt_playback_speed_enabled", "ptt_fast_lock_enabled", "ptt_reduce_recording_delay", "list_ui_refresh_enabled", "business_profile_refresh_m1_enabled", "youtube_inline_ui_enabled", "limit_RMR", "num_days_key_index_list_update", "remove_auth_token_download", "upload_host_switching_enabled", "download_host_switching_enabled", "md_portal_compatibility_level", "md_force_web_upgrade", "send_deeplink_jid_enabled", "report_network_data_usage_event", "oppo_android_11_badging_fix", "green_alert_setting_deep_links_enabled", "offline_enable_registration_funnel_logging", "entry_point_conversion_logging_enabled", "use_experimental_expo_keys", "payments_upi_onboarding_phase_one_flow_enabled", "conversation_row_link_preview_v2_send", "ctwa_voip_calls_logging_enabled", "delay_external_dir_initialization", "cart_v1_1_order_message_changes_enabled", "lwi_v1_ad_promotion_on_fb_enabled", "smb_cart_interstitial_enabled", "smb_onboarding_flow_type", "smb_collections_enabled", "smb_project_waldo_enabled", "new_business_profile_info_view_enabled", "smb_welcome_banner_enabled", "smb_profile_banner_new_copy_enabled", "smb_profile_banner_prioritized_enabled", "smb_banner_max_display_days", "smb_banner_max_click_count", "smb_banner_max_dismiss_count", "smb_banner_display_days_consec", "smb_days_between_banner", "edit_business_profile_new_mode_enabled", "smb_better_catalog_upload_enabled", "updated_business_registration_flow_enabled", "keyboard_popup_in_registration_disabled", "quoted_ui_elements_reply_message_migration_enabled", "quoted_order_message_tables_v2_migration_enabled", "smb_better_catalog_list_adapters_enabled", "customized_nux_enabled", "qpl_enabled", "qpl_max_file_size", "qpl_max_file_count", "qpl_upload_delay", "qpl_seed", "qpl_sampling", "qpl_sampling_as_string", "qpl_listeners_enabled", "qpl_metadata_provider_sampling_rate", "qpl_use_string_sampling_config", "voip_stack_call_timer", "upload_fs_in_group_call", "joinable_client_poll_interval_min", "stop_abprops_traffic_in_serverprops_response", "abprops_beta_pull_frequency", "wam_test_bool", "qr_scanner_view_v2_enabled", "android_button_message_killswitch", "calls_row_constraint_layout", "clear_chat_delete_media_files_in_parallel", "wam_privatestats_buffer_count", "android_key_store_auth_ver", "android_key_store_reliability_measure", "android_key_store_failure_cutoff_measure", "android_key_store_failed_too_much_measure", "android_key_store_recover_pwd_key", "android_key_store_delete_pwd_key", "android_key_store_hall_of_shame", "android_product_list_killswitch", "android_hourly_cron_via_privatestats", "save_capture_internal", "serializable_migration_statistics_enabled", "serializable_migration_batch_enabled", "job_manager_use_dynamic_number_of_consumer_threads", "job_manager_use_consumer_threads_core_pool_size", "job_manager_use_consumer_threads_max_pool_size", "job_manager_enable_deterministic_job_selection", "critical_event_upload_log_config", "blocked_events_log_uploads", "serializable_migration_me_enabled", "async_conversationlist_loading", "sticker_database_migration", "call_sharecontactutil_onactivityresult", "proj_waldo_enabled", "ephemeral_animation", "proj_ctwa_jid_enabled", "new_backup_format_enabled", "serial_executor_send_message_methods", "android_privatestats_endpoint_dit_enabled", "android_linked_devices_re_auth_enabled", "delete_chat_clear_chat_dialog_unified", "android_dev_prop_boolean", "android_dev_prop_int", "android_dev_prop_string", "enable_send_message_proactive_prekeys_fetch", "media_caption_ui_v2", "bsp_receipt", "new_invite_flow", "enable_biz_activity_report_request", "plm_products_max_batch_fetch_size", "chat_export_v2", "payments_onboarding_banner_enabled", "payments_onboarding_banner_duration_days", "green_alert", "green_alert_banner_duration", "green_alert_modal_start", "green_alert_block_start", "green_alert_block_jitter");
        AnonymousClass036 anonymousClass036 = new AnonymousClass036(0);
        if (asList != null) {
            anonymousClass036.addAll(asList);
        }
        A0k = anonymousClass036;
    }

    public C003701t(InterfaceC002901k interfaceC002901k, AnonymousClass037 anonymousClass037, C006202t c006202t, C02O c02o) {
        this.A0Q = interfaceC002901k;
        this.A0O = anonymousClass037;
        this.A0P = c006202t;
        this.A0N = c02o.A02("ab-props");
    }

    public static C003701t A00() {
        if (A0l == null) {
            synchronized (C003701t.class) {
                if (A0l == null) {
                    InterfaceC002901k A00 = C002801j.A00();
                    if (AnonymousClass037.A00 == null) {
                        synchronized (AnonymousClass037.class) {
                            if (AnonymousClass037.A00 == null) {
                                AnonymousClass037.A00 = new AnonymousClass037();
                            }
                        }
                    }
                    A0l = new C003701t(A00, AnonymousClass037.A00, C006202t.A00(), C02O.A00());
                }
            }
        }
        return A0l;
    }

    public static String A01(SparseArray sparseArray, int i) {
        Pair pair = (Pair) sparseArray.get(i);
        if (pair == null) {
            return null;
        }
        return (String) pair.second;
    }

    public static String A02(SparseArray sparseArray, int i) {
        Pair pair = (Pair) sparseArray.get(i);
        if (pair == null) {
            return null;
        }
        return (String) pair.first;
    }

    public synchronized int A03(int i) {
        if (i == 22) {
            A0B("ab_props:scroll_perf_expo_key");
            return this.A0N.getInt("ab_props:scroll_perf", 0);
        } else if (i == 23) {
            A0B("ab_props:smb_welcome_banner_enabled_expo_key");
            return this.A0N.getInt("ab_props:smb_welcome_banner_enabled", 0);
        } else if (i == 80) {
            A0B("ab_props:status_fast_streaming_initial_buffering_second_test_expo_key");
            return this.A0N.getInt("ab_props:status_fast_streaming_initial_buffering_second_test", 1);
        } else if (i == 81) {
            A0B("ab_props:status_fast_streaming_unstall_second_test_expo_key");
            return this.A0N.getInt("ab_props:status_fast_streaming_unstall_second_test", 1);
        } else if (i == 126) {
            A0B("ab_props:image_max_kb_for_skipping_compression_expo_key");
            return this.A0N.getInt("ab_props:image_max_kb_for_skipping_compression", 400);
        } else if (i == 127) {
            A0B("ab_props:bandwidth_estimation_algorithm_expo_key");
            return this.A0N.getInt("ab_props:bandwidth_estimation_algorithm", 0);
        } else if (i == 129) {
            A0B("ab_props:sender_higher_quality_bandwidth_threshold_expo_key");
            return this.A0N.getInt("ab_props:sender_higher_quality_bandwidth_threshold", 200);
        } else if (i == 130) {
            A0B("ab_props:receiver_higher_quality_bandwidth_threshold_expo_key");
            return this.A0N.getInt("ab_props:receiver_higher_quality_bandwidth_threshold", 400);
        } else if (i == 156) {
            A0B("ab_props:max_keys_expo_key");
            return this.A0N.getInt("ab_props:max_keys", 812);
        } else if (i == 157) {
            A0B("ab_props:video_max_bitrate_expo_key");
            return this.A0N.getInt("ab_props:video_max_bitrate", 5000);
        } else if (i == 185) {
            A0B("ab_props:android_test_scheduler_period_hours_expo_key");
            return this.A0N.getInt("ab_props:android_test_scheduler_period_hours", 6);
        } else if (i == 186) {
            A0B("ab_props:android_test_scheduler_run_seconds_expo_key");
            return this.A0N.getInt("ab_props:android_test_scheduler_run_seconds", 1);
        } else if (i == 191) {
            A0B("ab_props:enable_hash_based_hybrid_codecs_mask_expo_key");
            return this.A0N.getInt("ab_props:enable_hash_based_hybrid_codecs_mask", 0);
        } else if (i != 192) {
            switch (i) {
                case 25:
                    A0B("ab_props:buffer_for_playback_expo_key");
                    return this.A0N.getInt("ab_props:buffer_for_playback", 2500);
                case 49:
                    A0B("ab_props:media_autodownload_thread_pool_size_expo_key");
                    return this.A0N.getInt("ab_props:media_autodownload_thread_pool_size", 1);
                case 60:
                    A0B("ab_props:autodownload_priority_policy_expo_key");
                    return this.A0N.getInt("ab_props:autodownload_priority_policy", 0);
                case 119:
                    A0B("ab_props:new_wam_runtime_beaconing_expo_key");
                    return this.A0N.getInt("ab_props:new_wam_runtime_beaconing", 100);
                case 134:
                    A0B("ab_props:wamsys_registration_value_expo_key");
                    return this.A0N.getInt("ab_props:wamsys_registration_value", -1);
                case 136:
                    A0B("ab_props:mms_chatd_resume_check_override_expo_key");
                    return this.A0N.getInt("ab_props:mms_chatd_resume_check_override", -1);
                case 142:
                    A0B("ab_props:auto_expo_int_field_expo_key");
                    return this.A0N.getInt("ab_props:auto_expo_int_field", -1);
                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                    A0B("ab_props:auto_expo_status_tab_open_expo_key");
                    return this.A0N.getInt("ab_props:auto_expo_status_tab_open", -1);
                case 163:
                    A0B("ab_props:smb_banner_max_display_days_expo_key");
                    return this.A0N.getInt("ab_props:smb_banner_max_display_days", 4);
                case 164:
                    A0B("ab_props:smb_banner_max_click_count_expo_key");
                    return this.A0N.getInt("ab_props:smb_banner_max_click_count", 2);
                case 165:
                    A0B("ab_props:smb_banner_max_dismiss_count_expo_key");
                    return this.A0N.getInt("ab_props:smb_banner_max_dismiss_count", 1);
                case 166:
                    A0B("ab_props:smb_banner_display_days_consec_expo_key");
                    return this.A0N.getInt("ab_props:smb_banner_display_days_consec", 2);
                case 167:
                    A0B("ab_props:smb_days_between_banner_expo_key");
                    return this.A0N.getInt("ab_props:smb_days_between_banner", 4);
                case 168:
                    A0B("ab_props:media_max_autodownload_wifi_mb_expo_key");
                    return this.A0N.getInt("ab_props:media_max_autodownload_wifi_mb", 100);
                case 169:
                    A0B("ab_props:media_max_autodownload_expo_key");
                    return this.A0N.getInt("ab_props:media_max_autodownload", 32);
                case 175:
                    A0B("ab_props:status_video_max_duration_expo_key");
                    return this.A0N.getInt("ab_props:status_video_max_duration", 45);
                case 200:
                    A0B("ab_props:db_migration_low_latency_kill_switch_latency_expo_key");
                    return this.A0N.getInt("ab_props:db_migration_low_latency_kill_switch_latency", 0);
                case 213:
                    A0B("ab_props:qpl_max_file_size_expo_key");
                    return this.A0N.getInt("ab_props:qpl_max_file_size", 1024);
                case 214:
                    A0B("ab_props:qpl_max_file_count_expo_key");
                    return this.A0N.getInt("ab_props:qpl_max_file_count", 5);
                case 215:
                    A0B("ab_props:qpl_upload_delay_expo_key");
                    return this.A0N.getInt("ab_props:qpl_upload_delay", 1440);
                case 224:
                    A0B("ab_props:low_space_threshold_expo_key");
                    return this.A0N.getInt("ab_props:low_space_threshold", 50);
                case 225:
                    A0B("ab_props:qpl_seed_expo_key");
                    return this.A0N.getInt("ab_props:qpl_seed", 0);
                case 258:
                    A0B("ab_props:media_upload_max_aggressive_retries_expo_key");
                    return this.A0N.getInt("ab_props:media_upload_max_aggressive_retries", 3);
                case 261:
                    A0B("ab_props:db_migration_max_db_size_expo_key");
                    return this.A0N.getInt("ab_props:db_migration_max_db_size", 0);
                case 282:
                    A0B("ab_props:group_chat_message_push_priority_obfuscation_percent_expo_key");
                    return this.A0N.getInt("ab_props:group_chat_message_push_priority_obfuscation_percent", 0);
                case 305:
                    A0B("ab_props:privatestats_upload_jitter_secs_expo_key");
                    return this.A0N.getInt("ab_props:privatestats_upload_jitter_secs", 30);
                case 310:
                    A0B("ab_props:md_icdc_hash_length_expo_key");
                    return this.A0N.getInt("ab_props:md_icdc_hash_length", 10);
                case 327:
                    A0B("ab_props:abprops_beta_pull_frequency_expo_key");
                    return this.A0N.getInt("ab_props:abprops_beta_pull_frequency", 86400);
                case 350:
                    A0B("ab_props:groups_banner_conversations_count_expo_key");
                    return this.A0N.getInt("ab_props:groups_banner_conversations_count", 3);
                case 351:
                    A0B("ab_props:groups_banner_consecutive_days_count_expo_key");
                    return this.A0N.getInt("ab_props:groups_banner_consecutive_days_count", 3);
                case 352:
                    A0B("ab_props:groups_banner_total_days_count_expo_key");
                    return this.A0N.getInt("ab_props:groups_banner_total_days_count", -1);
                case 353:
                    A0B("ab_props:groups_banner_max_clicks_expo_key");
                    return this.A0N.getInt("ab_props:groups_banner_max_clicks", -1);
                case 354:
                    A0B("ab_props:groups_banner_max_dismisses_expo_key");
                    return this.A0N.getInt("ab_props:groups_banner_max_dismisses", 3);
                case 356:
                    A0B("ab_props:green_alert_banner_duration_expo_key");
                    return this.A0N.getInt("ab_props:green_alert_banner_duration", 0);
                case 357:
                    A0B("ab_props:green_alert_modal_start_expo_key");
                    return this.A0N.getInt("ab_props:green_alert_modal_start", 0);
                case 358:
                    A0B("ab_props:green_alert_block_start_expo_key");
                    return this.A0N.getInt("ab_props:green_alert_block_start", 0);
                case 365:
                    A0B("ab_props:green_alert_block_jitter_expo_key");
                    return this.A0N.getInt("ab_props:green_alert_block_jitter", 0);
                case 371:
                    A0B("ab_props:wam_privatestats_buffer_count_expo_key");
                    return this.A0N.getInt("ab_props:wam_privatestats_buffer_count", 4);
                case 374:
                    A0B("ab_props:android_key_store_auth_ver_expo_key");
                    return this.A0N.getInt("ab_props:android_key_store_auth_ver", -1);
                case 375:
                    A0B("ab_props:android_key_store_reliability_measure_expo_key");
                    return this.A0N.getInt("ab_props:android_key_store_reliability_measure", 50);
                case 376:
                    A0B("ab_props:android_key_store_failed_too_much_measure_expo_key");
                    return this.A0N.getInt("ab_props:android_key_store_failed_too_much_measure", -1);
                case 384:
                    A0B("ab_props:android_key_store_failure_cutoff_measure_expo_key");
                    return this.A0N.getInt("ab_props:android_key_store_failure_cutoff_measure", 0);
                case 398:
                    A0B("ab_props:qpl_metadata_provider_sampling_rate_expo_key");
                    return this.A0N.getInt("ab_props:qpl_metadata_provider_sampling_rate", 0);
                case 419:
                    A0B("ab_props:job_manager_use_consumer_threads_core_pool_size_expo_key");
                    return this.A0N.getInt("ab_props:job_manager_use_consumer_threads_core_pool_size", 2);
                case 420:
                    A0B("ab_props:job_manager_use_consumer_threads_max_pool_size_expo_key");
                    return this.A0N.getInt("ab_props:job_manager_use_consumer_threads_max_pool_size", 15);
                case 431:
                    A0B("ab_props:android_message_logout_timeout_minutes_expo_key");
                    return this.A0N.getInt("ab_props:android_message_logout_timeout_minutes", 10);
                case 446:
                    A0B("ab_props:smb_onboarding_flow_type_expo_key");
                    return this.A0N.getInt("ab_props:smb_onboarding_flow_type", 0);
                case 464:
                    A0B("ab_props:plm_products_max_batch_fetch_size_expo_key");
                    return this.A0N.getInt("ab_props:plm_products_max_batch_fetch_size", 18);
                case 471:
                    A0B("ab_props:biz_profile_options_new_expo_key");
                    return this.A0N.getInt("ab_props:biz_profile_options_new", 0);
                case 477:
                    A0B("ab_props:num_days_key_index_list_update_expo_key");
                    return this.A0N.getInt("ab_props:num_days_key_index_list_update", 0);
                case 486:
                    A0B("ab_props:payments_onboarding_banner_duration_days_expo_key");
                    return this.A0N.getInt("ab_props:payments_onboarding_banner_duration_days", 7);
                case 489:
                    A0B("ab_props:md_portal_compatibility_level_expo_key");
                    return this.A0N.getInt("ab_props:md_portal_compatibility_level", 0);
                case 501:
                    A0B("ab_props:android_dev_prop_int_expo_key");
                    return this.A0N.getInt("ab_props:android_dev_prop_int", 0);
                case 522:
                    A0B("ab_props:joinable_client_poll_interval_min_expo_key");
                    return this.A0N.getInt("ab_props:joinable_client_poll_interval_min", 60);
                default:
                    switch (i) {
                        case 86:
                            A0B("ab_props:image_max_edge_test_expo_key");
                            return this.A0N.getInt("ab_props:image_max_edge_test", 0);
                        case 87:
                            A0B("ab_props:status_image_max_edge_test_expo_key");
                            return this.A0N.getInt("ab_props:status_image_max_edge_test", 0);
                        case 88:
                            A0B("ab_props:image_compression_quality_test_expo_key");
                            return this.A0N.getInt("ab_props:image_compression_quality_test", 0);
                        case 89:
                            A0B("ab_props:status_image_compression_quality_test_expo_key");
                            return this.A0N.getInt("ab_props:status_image_compression_quality_test", 0);
                        case 90:
                            A0B("ab_props:image_quality_group_expo_key");
                            return this.A0N.getInt("ab_props:image_quality_group", 0);
                        default:
                            switch (i) {
                                case 112:
                                    A0B("ab_props:download_full_pjpeg_max_edge_expo_key");
                                    return this.A0N.getInt("ab_props:download_full_pjpeg_max_edge", 0);
                                case 113:
                                    A0B("ab_props:download_full_pjpeg_max_edge_status_expo_key");
                                    return this.A0N.getInt("ab_props:download_full_pjpeg_max_edge_status", 0);
                                case 114:
                                    A0B("ab_props:higher_image_max_edge_expo_key");
                                    return this.A0N.getInt("ab_props:higher_image_max_edge", 0);
                                case 115:
                                    A0B("ab_props:higher_image_max_edge_status_expo_key");
                                    return this.A0N.getInt("ab_props:higher_image_max_edge_status", 0);
                                case 116:
                                    A0B("ab_props:higher_image_quality_expo_key");
                                    return this.A0N.getInt("ab_props:higher_image_quality", 0);
                                case 117:
                                    A0B("ab_props:higher_image_quality_status_expo_key");
                                    return this.A0N.getInt("ab_props:higher_image_quality_status", 0);
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unrecognized field with code ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                    }
            }
        } else {
            A0B("ab_props:upload_thread_lower_priority_expo_key");
            return this.A0N.getInt("ab_props:upload_thread_lower_priority", 0);
        }
    }

    public synchronized long A04() {
        return this.A0N.getLong("ab_props:sys:last_refresh_time", 0L);
    }

    public synchronized String A05(int i) {
        if (i == 183) {
            A0B("ab_props:android_test_scheduler_api_expo_key");
            return this.A0N.getString("ab_props:android_test_scheduler_api", "none");
        } else if (i != 184) {
            switch (i) {
                case 151:
                    A0B("ab_props:android_camera2_support_level_expo_key");
                    return this.A0N.getString("ab_props:android_camera2_support_level", "");
                case 203:
                    A0B("ab_props:db_migration_low_latency_kill_switch_experiment_expo_key");
                    return this.A0N.getString("ab_props:db_migration_low_latency_kill_switch_experiment", "");
                case 242:
                    A0B("ab_props:db_migration_level_force_expo_key");
                    return this.A0N.getString("ab_props:db_migration_level_force", "none");
                case 265:
                    A0B("ab_props:shops_storefront_urls_config_expo_key");
                    return this.A0N.getString("ab_props:shops_storefront_urls_config", "");
                case 379:
                    A0B("ab_props:in_app_support_v2_locale_langs_expo_key");
                    return this.A0N.getString("ab_props:in_app_support_v2_locale_langs", "");
                case 388:
                    A0B("ab_props:android_key_store_hall_of_shame_expo_key");
                    return this.A0N.getString("ab_props:android_key_store_hall_of_shame", "");
                case 390:
                    A0B("ab_props:in_app_support_v2_numbers_expo_key");
                    return this.A0N.getString("ab_props:in_app_support_v2_numbers", "");
                case 402:
                    A0B("ab_props:db_migration_min_disk_size_expo_key");
                    return this.A0N.getString("ab_props:db_migration_min_disk_size", "");
                case 404:
                    A0B("ab_props:db_migration_level_force_blocked_expo_key");
                    return this.A0N.getString("ab_props:db_migration_level_force_blocked", "none");
                case 414:
                    A0B("ab_props:critical_event_upload_log_config_expo_key");
                    return this.A0N.getString("ab_props:critical_event_upload_log_config", "AppMessagingXmppHandler/onLogNotification:1;WhatsAppLibLoader/loadStartupLibs:1;AbstractAppShell/maybeReportDecompressionFailure:1;");
                case 426:
                    A0B("ab_props:blocked_events_log_uploads_expo_key");
                    return this.A0N.getString("ab_props:blocked_events_log_uploads", "");
                case 466:
                    A0B("ab_props:qpl_sampling_as_string_expo_key");
                    return this.A0N.getString("ab_props:qpl_sampling_as_string", "json:{\"sampling\":[]}");
                case 502:
                    A0B("ab_props:android_dev_prop_string_expo_key");
                    return this.A0N.getString("ab_props:android_dev_prop_string", "");
                default:
                    switch (i) {
                        case 205:
                            A0B("ab_props:db_migration_data_source_v1_expo_key");
                            return this.A0N.getString("ab_props:db_migration_data_source_v1", "all");
                        case 206:
                            A0B("ab_props:db_migration_data_source_v2_expo_key");
                            return this.A0N.getString("ab_props:db_migration_data_source_v2", "none");
                        case 207:
                            A0B("ab_props:db_migration_level_reset_expo_key");
                            return this.A0N.getString("ab_props:db_migration_level_reset", "none");
                        case 208:
                            A0B("ab_props:db_migration_level_keep_expo_key");
                            return this.A0N.getString("ab_props:db_migration_level_keep", "all");
                        case 209:
                            A0B("ab_props:db_migration_level_migrate_expo_key");
                            return this.A0N.getString("ab_props:db_migration_level_migrate", "none");
                        case 210:
                            A0B("ab_props:shops_pdp_urls_config_expo_key");
                            return this.A0N.getString("ab_props:shops_pdp_urls_config", "");
                        default:
                            switch (i) {
                                case 513:
                                    A0B("ab_props:bloks_anonymous_access_app_id_expo_key");
                                    return this.A0N.getString("ab_props:bloks_anonymous_access_app_id", "{}");
                                case 514:
                                    A0B("ab_props:bloks_loggedin_access_app_id_expo_key");
                                    return this.A0N.getString("ab_props:bloks_loggedin_access_app_id", "{}");
                                case 515:
                                    A0B("ab_props:bloks_loggedin_employee_or_tester_access_app_id_expo_key");
                                    return this.A0N.getString("ab_props:bloks_loggedin_employee_or_tester_access_app_id", "{}");
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unrecognized field with code ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                    }
            }
        } else {
            A0B("ab_props:android_test_scheduler_period_impl_expo_key");
            return this.A0N.getString("ab_props:android_test_scheduler_period_impl", "none");
        }
    }

    public synchronized JSONObject A06(int i) {
        if (i == 226) {
            A0B("ab_props:qpl_sampling_expo_key");
            return A07("ab_props:qpl_sampling", "{\"sampling\":[]}");
        } else if (i == 277) {
            A0B("ab_props:db_verification_controls_expo_key");
            return A07("ab_props:db_verification_controls", "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized field with code ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final JSONObject A07(String str, String str2) {
        SharedPreferences sharedPreferences = this.A0N;
        String string = sharedPreferences.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            str2 = string;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid json format for property from file; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            edit.apply();
            throw new IllegalArgumentException(C000200d.A0J("PropsCommon/invalid json format for property; prefKey=", str, "; value=", str2), e);
        }
    }

    public synchronized void A08(int i) {
        SharedPreferences.Editor edit = this.A0N.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i);
        edit.apply();
    }

    public synchronized void A09(int i) {
        SharedPreferences.Editor edit = this.A0N.edit();
        edit.putInt("ab_props:sys:last_error_code", i);
        edit.apply();
    }

    public final synchronized void A0A(SharedPreferences.Editor editor, Set set) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", set);
        editor.apply();
        C006202t c006202t = this.A0P;
        String join = TextUtils.join(",", set);
        c006202t.A03(5029, join, 0);
        c006202t.A03(5029, join, 1);
    }

    public final void A0B(String str) {
        Set anonymousClass036;
        if (this.A0j == null) {
            synchronized (this) {
                if (this.A0j == null) {
                    this.A0j = Boolean.valueOf(this.A0N.getBoolean("ab_props:use_experimental_expo_keys", false));
                }
            }
        }
        if (this.A0j.booleanValue()) {
            synchronized (this) {
                if (this.A0b.add(str)) {
                    SharedPreferences sharedPreferences = this.A0N;
                    String string = sharedPreferences.getString(str, null);
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    Set<String> stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", null);
                    if (stringSet == null || stringSet.contains(string)) {
                        return;
                    }
                    HashSet hashSet = new HashSet(stringSet.size() + 1);
                    hashSet.addAll(stringSet);
                    hashSet.add(string);
                    A0A(sharedPreferences.edit(), hashSet);
                    return;
                }
                return;
            }
        }
        SharedPreferences sharedPreferences2 = this.A0N;
        String string2 = sharedPreferences2.getString(str, null);
        Collection stringSet2 = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", null);
        if (stringSet2 == null) {
            anonymousClass036 = new AnonymousClass036(0);
        } else {
            anonymousClass036 = new AnonymousClass036(0);
            anonymousClass036.addAll(stringSet2);
        }
        if (!TextUtils.isEmpty(string2) && !anonymousClass036.contains(string2)) {
            anonymousClass036.add(string2);
            synchronized (this) {
                A0A(sharedPreferences2.edit(), anonymousClass036);
            }
        }
    }

    public synchronized boolean A0C(int i) {
        if (i == 58) {
            A0B("ab_props:watls_no_dns_expo_key");
            return this.A0N.getBoolean("ab_props:watls_no_dns", false);
        } else if (i == 59) {
            A0B("ab_props:watls_prefer_ip6_expo_key");
            return this.A0N.getBoolean("ab_props:watls_prefer_ip6", false);
        } else if (i == 71) {
            A0B("ab_props:offline_text_color_change_expo_key");
            return this.A0N.getBoolean("ab_props:offline_text_color_change", false);
        } else if (i == 72) {
            A0B("ab_props:mms_tcp_congestion_bbr_expo_key");
            return this.A0N.getBoolean("ab_props:mms_tcp_congestion_bbr", false);
        } else if (i == 109) {
            A0B("ab_props:pjpeg_status_data_saver_enabled_expo_key");
            return this.A0N.getBoolean("ab_props:pjpeg_status_data_saver_enabled", false);
        } else if (i == 110) {
            A0B("ab_props:pjpeg_chat_data_saver_enabled_expo_key");
            return this.A0N.getBoolean("ab_props:pjpeg_chat_data_saver_enabled", false);
        } else if (i == 158) {
            A0B("ab_props:smb_profile_banner_new_copy_enabled_expo_key");
            return this.A0N.getBoolean("ab_props:smb_profile_banner_new_copy_enabled", false);
        } else if (i != 159) {
            switch (i) {
                case 15:
                    A0B("ab_props:disable_prewarm_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_prewarm", false);
                case 24:
                    A0B("ab_props:progressive_jpeg_thumbnail_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:progressive_jpeg_thumbnail_enabled", false);
                case 37:
                    A0B("ab_props:new_business_profile_info_view_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:new_business_profile_info_view_enabled", false);
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                    A0B("ab_props:reusable_video_player_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:reusable_video_player_enabled", false);
                case 48:
                    A0B("ab_props:watls_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:watls_enabled", false);
                case 56:
                    A0B("ab_props:status_ranking_expo_key");
                    return this.A0N.getBoolean("ab_props:status_ranking", false);
                case 65:
                    A0B("ab_props:watls_early_data_expo_key");
                    return this.A0N.getBoolean("ab_props:watls_early_data", false);
                case 75:
                    A0B("ab_props:whats_my_number_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:whats_my_number_enabled", false);
                case 77:
                    A0B("ab_props:consumer_reg_profile_design_expo_key");
                    return this.A0N.getBoolean("ab_props:consumer_reg_profile_design", false);
                case 79:
                    A0B("ab_props:status_fast_streaming_enable_test_expo_key");
                    return this.A0N.getBoolean("ab_props:status_fast_streaming_enable_test", false);
                case 91:
                    A0B("ab_props:sms_retriever_first_expo_key");
                    return this.A0N.getBoolean("ab_props:sms_retriever_first", false);
                case 118:
                    A0B("ab_props:new_wam_runtime_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:new_wam_runtime_enabled", true);
                case 128:
                    A0B("ab_props:lazy_camera_view_inflation_expo_key");
                    return this.A0N.getBoolean("ab_props:lazy_camera_view_inflation", true);
                case 138:
                    A0B("ab_props:disable_status_autodownload_inactive_users_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_status_autodownload_inactive_users", false);
                case 140:
                    A0B("ab_props:wamsys_registration_v3_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_registration_v3_enabled", false);
                case 143:
                    A0B("ab_props:wamsys_registration_v4_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_registration_v4_enabled", false);
                case 145:
                    A0B("ab_props:wamsys_registration_v5_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_registration_v5_enabled", false);
                case 152:
                    A0B("ab_props:connect_with_friends_dialog_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:connect_with_friends_dialog_enabled", false);
                case 154:
                    A0B("ab_props:bandwidth_estimation_adjacent_hours_optimization_expo_key");
                    return this.A0N.getBoolean("ab_props:bandwidth_estimation_adjacent_hours_optimization", true);
                case 161:
                    A0B("ab_props:work_manager_hourly_cron_expo_key");
                    return this.A0N.getBoolean("ab_props:work_manager_hourly_cron", false);
                case 170:
                    A0B("ab_props:work_manager_ntp_sync_expo_key");
                    return this.A0N.getBoolean("ab_props:work_manager_ntp_sync", false);
                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                    A0B("ab_props:voip_fix_converter_memory_leak_expo_key");
                    return this.A0N.getBoolean("ab_props:voip_fix_converter_memory_leak", false);
                case 177:
                    A0B("ab_props:camelot_expo_key");
                    return this.A0N.getBoolean("ab_props:camelot", false);
                case 178:
                    A0B("ab_props:roundtable_expo_key");
                    return this.A0N.getBoolean("ab_props:roundtable", false);
                case 179:
                    A0B("ab_props:room_messenger_upgrade_expo_key");
                    return this.A0N.getBoolean("ab_props:room_messenger_upgrade", false);
                case 180:
                    A0B("ab_props:enable_non_wake_up_alarm_ping_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_non_wake_up_alarm_ping", true);
                case 181:
                    A0B("ab_props:async_init_after_thread_idle_expo_key");
                    return this.A0N.getBoolean("ab_props:async_init_after_thread_idle", true);
                case 182:
                    A0B("ab_props:wamsys_decryption_individual_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_decryption_individual_enabled", false);
                case 187:
                    A0B("ab_props:wamsys_encryption_individual_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_encryption_individual_enabled", false);
                case 188:
                    A0B("ab_props:wamsys_decryption_group_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_decryption_group_enabled", false);
                case 189:
                    A0B("ab_props:wamsys_encryption_group_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:wamsys_encryption_group_enabled", false);
                case 190:
                    A0B("ab_props:transsion_badging_expo_key");
                    return this.A0N.getBoolean("ab_props:transsion_badging", false);
                case 196:
                    A0B("ab_props:async_data_load_on_startup_expo_key");
                    return this.A0N.getBoolean("ab_props:async_data_load_on_startup", false);
                case 198:
                    A0B("ab_props:bloks_use_minscript_android_expo_key");
                    return this.A0N.getBoolean("ab_props:bloks_use_minscript_android", true);
                case 199:
                    A0B("ab_props:load_chats_lazily_expo_key");
                    return this.A0N.getBoolean("ab_props:load_chats_lazily", false);
                case 201:
                    A0B("ab_props:db_migration_low_latency_kill_switch_expo_key");
                    return this.A0N.getBoolean("ab_props:db_migration_low_latency_kill_switch", false);
                case 211:
                    A0B("ab_props:wallpapers_v2_expo_key");
                    return this.A0N.getBoolean("ab_props:wallpapers_v2", false);
                case 212:
                    A0B("ab_props:qpl_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:qpl_enabled", false);
                case 227:
                    A0B("ab_props:video_transcode_retry_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:video_transcode_retry_enabled", false);
                case 228:
                    A0B("ab_props:video_transcode_fallback_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:video_transcode_fallback_enabled", false);
                case 229:
                    A0B("ab_props:dedupe_transcode_images_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_images", false);
                case 230:
                    A0B("ab_props:dedupe_transcode_videos_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_videos", false);
                case 231:
                    A0B("ab_props:dedupe_transcode_gif_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_gif", false);
                case 232:
                    A0B("ab_props:dedupe_transcode_audio_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_audio", false);
                case 233:
                    A0B("ab_props:in_app_support_v2_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:in_app_support_v2_enabled", false);
                case 234:
                    A0B("ab_props:disable_new_sticker_animation_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_new_sticker_animation", false);
                case 235:
                    A0B("ab_props:enable_mmap_stringpacks_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_mmap_stringpacks", false);
                case 237:
                    A0B("ab_props:new_sticker_animation_behavior_v2_expo_key");
                    return this.A0N.getBoolean("ab_props:new_sticker_animation_behavior_v2", false);
                case 238:
                    A0B("ab_props:disable_privatestats_battery_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_privatestats_battery", false);
                case 239:
                    A0B("ab_props:remove_geolocation_videos_expo_key");
                    return this.A0N.getBoolean("ab_props:remove_geolocation_videos", false);
                case 240:
                    A0B("ab_props:sticker_search_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_search_enabled", false);
                case 241:
                    A0B("ab_props:enable_privatestats_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_privatestats", false);
                case 246:
                    A0B("ab_props:upload_status_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:upload_status_thumb_mms_enabled", false);
                case 247:
                    A0B("ab_props:upload_document_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:upload_document_thumb_mms_enabled", false);
                case 248:
                    A0B("ab_props:upload_link_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:upload_link_thumb_mms_enabled", false);
                case 249:
                    A0B("ab_props:download_status_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:download_status_thumb_mms_enabled", false);
                case 250:
                    A0B("ab_props:download_document_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:download_document_thumb_mms_enabled", false);
                case 251:
                    A0B("ab_props:download_link_thumb_mms_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:download_link_thumb_mms_enabled", false);
                case 252:
                    A0B("ab_props:send_status_thumb_in_message_disabled_expo_key");
                    return this.A0N.getBoolean("ab_props:send_status_thumb_in_message_disabled", false);
                case 253:
                    A0B("ab_props:send_document_thumb_in_message_disabled_expo_key");
                    return this.A0N.getBoolean("ab_props:send_document_thumb_in_message_disabled", false);
                case 254:
                    A0B("ab_props:send_link_thumb_in_message_disabled_expo_key");
                    return this.A0N.getBoolean("ab_props:send_link_thumb_in_message_disabled", false);
                case 255:
                    A0B("ab_props:animated_stickers_thread_clean_up_expo_key");
                    return this.A0N.getBoolean("ab_props:animated_stickers_thread_clean_up", false);
                case 256:
                    A0B("ab_props:media_upload_aggressive_retry_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:media_upload_aggressive_retry_enabled", false);
                case 257:
                    A0B("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled", false);
                case 259:
                    A0B("ab_props:enable_catalogs_carts_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_catalogs_carts", false);
                case 263:
                    A0B("ab_props:dedupe_transcode_shared_images_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_shared_images", false);
                case 264:
                    A0B("ab_props:dedupe_transcode_shared_videos_expo_key");
                    return this.A0N.getBoolean("ab_props:dedupe_transcode_shared_videos", false);
                case 266:
                    A0B("ab_props:app_locked_with_biometrics_expo_key");
                    return this.A0N.getBoolean("ab_props:app_locked_with_biometrics", false);
                case 267:
                    A0B("ab_props:shops_storefront_native_entrypoint_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:shops_storefront_native_entrypoint_enabled", false);
                case 270:
                    A0B("ab_props:android_media_use_fresco_for_gifs_expo_key");
                    return this.A0N.getBoolean("ab_props:android_media_use_fresco_for_gifs", false);
                case 271:
                    A0B("ab_props:sticker_tray_animation_finite_loops_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_tray_animation_finite_loops", false);
                case 272:
                    A0B("ab_props:sticker_tray_animation_first_row_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_tray_animation_first_row", false);
                case 273:
                    A0B("ab_props:sticker_tray_animation_fully_visible_items_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_tray_animation_fully_visible_items", false);
                case 274:
                    A0B("ab_props:pen_smoothing_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:pen_smoothing_enabled", false);
                case 276:
                    A0B("ab_props:sticker_picker_animated_sticker_shrinking_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_picker_animated_sticker_shrinking", false);
                case 278:
                    A0B("ab_props:status_grid_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:status_grid_enabled", false);
                case 279:
                    A0B("ab_props:pencil_ui_enhancements_wave_1_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:pencil_ui_enhancements_wave_1_enabled", false);
                case 280:
                    A0B("ab_props:android_push_notify_fg_service_expo_key");
                    return this.A0N.getBoolean("ab_props:android_push_notify_fg_service", false);
                case 281:
                    A0B("ab_props:enable_long_running_job_monitor_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_long_running_job_monitor", true);
                case 283:
                    A0B("ab_props:android_push_config_muted_chats_expo_key");
                    return this.A0N.getBoolean("ab_props:android_push_config_muted_chats", false);
                case 290:
                    A0B("ab_props:third_party_animated_sticker_import_expo_key");
                    return this.A0N.getBoolean("ab_props:third_party_animated_sticker_import", false);
                case 291:
                    A0B("ab_props:sticker_contextual_suggestion_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_contextual_suggestion_enabled", false);
                case 292:
                    A0B("ab_props:android_us_language_selector_expo_key");
                    return this.A0N.getBoolean("ab_props:android_us_language_selector", true);
                case 295:
                    A0B("ab_props:disable_third_party_animated_sticker_animation_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_third_party_animated_sticker_animation", false);
                case 296:
                    A0B("ab_props:stanza_processing_logging_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:stanza_processing_logging_enabled", true);
                case 297:
                    A0B("ab_props:edit_business_profile_new_mode_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:edit_business_profile_new_mode_enabled", false);
                case 306:
                    A0B("ab_props:smb_better_catalog_upload_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:smb_better_catalog_upload_enabled", false);
                case 307:
                    A0B("ab_props:payments_bloks_rendercore_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:payments_bloks_rendercore_enabled", false);
                case 308:
                    A0B("ab_props:groups_dogfooding_ui_expo_key");
                    return this.A0N.getBoolean("ab_props:groups_dogfooding_ui", false);
                case 309:
                    A0B("ab_props:md_icdc_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:md_icdc_enabled", false);
                case 311:
                    A0B("ab_props:watls_enable_early_data_http_post_expo_key");
                    return this.A0N.getBoolean("ab_props:watls_enable_early_data_http_post", false);
                case 312:
                    A0B("ab_props:watls_enable_early_data_http_get_expo_key");
                    return this.A0N.getBoolean("ab_props:watls_enable_early_data_http_get", false);
                case 314:
                    A0B("ab_props:yt_video_preview_expo_key");
                    return this.A0N.getBoolean("ab_props:yt_video_preview", true);
                case 315:
                    A0B("ab_props:stop_abprops_traffic_in_serverprops_response_expo_key");
                    return this.A0N.getBoolean("ab_props:stop_abprops_traffic_in_serverprops_response", false);
                case 316:
                    A0B("ab_props:disable_buttons_message_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_buttons_message", false);
                case 325:
                    A0B("ab_props:mute_video_expo_key");
                    return this.A0N.getBoolean("ab_props:mute_video", false);
                case 332:
                    A0B("ab_props:new_user_location_dialogs_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:new_user_location_dialogs_enabled", false);
                case 334:
                    A0B("ab_props:use_compressed_packfile_expo_key");
                    return this.A0N.getBoolean("ab_props:use_compressed_packfile", false);
                case 340:
                    A0B("ab_props:updated_business_registration_flow_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:updated_business_registration_flow_enabled", false);
                case 341:
                    A0B("ab_props:keyboard_popup_in_registration_disabled_expo_key");
                    return this.A0N.getBoolean("ab_props:keyboard_popup_in_registration_disabled", false);
                case 344:
                    A0B("ab_props:green_alert_expo_key");
                    return this.A0N.getBoolean("ab_props:green_alert", false);
                case 349:
                    A0B("ab_props:qr_scanner_view_v2_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:qr_scanner_view_v2_enabled", false);
                case 355:
                    A0B("ab_props:shops_storefront_icon_and_preview_entrypoints_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:shops_storefront_icon_and_preview_entrypoints_enabled", false);
                case 360:
                    A0B("ab_props:enable_cart_v1_1_business_actions_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_cart_v1_1_business_actions", false);
                case 361:
                    A0B("ab_props:played_self_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:played_self_enabled", false);
                case 362:
                    A0B("ab_props:android_button_message_killswitch_expo_key");
                    return this.A0N.getBoolean("ab_props:android_button_message_killswitch", false);
                case 363:
                    A0B("ab_props:important_messages_expo_key");
                    return this.A0N.getBoolean("ab_props:important_messages", false);
                case 364:
                    A0B("ab_props:cart_v1_1_order_message_changes_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:cart_v1_1_order_message_changes_enabled", false);
                case 366:
                    A0B("ab_props:user_notice_clear_expo_key");
                    return this.A0N.getBoolean("ab_props:user_notice_clear", false);
                case 367:
                    A0B("ab_props:calls_row_constraint_layout_expo_key");
                    return this.A0N.getBoolean("ab_props:calls_row_constraint_layout", false);
                case 369:
                    A0B("ab_props:product_catalog_hide_show_items_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:product_catalog_hide_show_items_enabled", false);
                case 370:
                    A0B("ab_props:sticker_pack_deeplink_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_pack_deeplink_enabled", false);
                case 372:
                    A0B("ab_props:media_caption_ui_v2_expo_key");
                    return this.A0N.getBoolean("ab_props:media_caption_ui_v2", false);
                case 373:
                    A0B("ab_props:bsp_receipt_expo_key");
                    return this.A0N.getBoolean("ab_props:bsp_receipt", false);
                case 377:
                    A0B("ab_props:android_key_store_recover_pwd_key_expo_key");
                    return this.A0N.getBoolean("ab_props:android_key_store_recover_pwd_key", false);
                case 378:
                    A0B("ab_props:android_key_store_delete_pwd_key_expo_key");
                    return this.A0N.getBoolean("ab_props:android_key_store_delete_pwd_key", false);
                case 381:
                    A0B("ab_props:catalog_cart_on_off_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:catalog_cart_on_off_enabled", false);
                case 382:
                    A0B("ab_props:ephemeral_media_private_expo_key");
                    return this.A0N.getBoolean("ab_props:ephemeral_media_private", false);
                case 385:
                    A0B("ab_props:android_product_list_killswitch_expo_key");
                    return this.A0N.getBoolean("ab_props:android_product_list_killswitch", false);
                case 386:
                    A0B("ab_props:enable_cup_phone_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_cup_phone", false);
                case 387:
                    A0B("ab_props:new_invite_flow_expo_key");
                    return this.A0N.getBoolean("ab_props:new_invite_flow", false);
                case 391:
                    A0B("ab_props:conversation_async_view_inflation_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:conversation_async_view_inflation_enabled", false);
                case 394:
                    A0B("ab_props:report_disk_event_expo_key");
                    return this.A0N.getBoolean("ab_props:report_disk_event", false);
                case 395:
                    A0B("ab_props:quoted_order_message_tables_migration_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:quoted_order_message_tables_migration_enabled", false);
                case 397:
                    A0B("ab_props:qpl_listeners_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:qpl_listeners_enabled", false);
                case 399:
                    A0B("ab_props:android_hourly_cron_via_privatestats_expo_key");
                    return this.A0N.getBoolean("ab_props:android_hourly_cron_via_privatestats", false);
                case 400:
                    A0B("ab_props:conversation_media_preview_v2_expo_key");
                    return this.A0N.getBoolean("ab_props:conversation_media_preview_v2", false);
                case 401:
                    A0B("ab_props:save_capture_internal_expo_key");
                    return this.A0N.getBoolean("ab_props:save_capture_internal", false);
                case 403:
                    A0B("ab_props:serializable_migration_statistics_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:serializable_migration_statistics_enabled", false);
                case 407:
                    A0B("ab_props:ephemeral_24h_duration_expo_key");
                    return this.A0N.getBoolean("ab_props:ephemeral_24h_duration", false);
                case 412:
                    A0B("ab_props:suspicious_chats_privacy_upsell_banner_expo_key");
                    return this.A0N.getBoolean("ab_props:suspicious_chats_privacy_upsell_banner", false);
                case 413:
                    A0B("ab_props:lwi_v1_ad_promotion_on_fb_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:lwi_v1_ad_promotion_on_fb_enabled", false);
                case 418:
                    A0B("ab_props:job_manager_use_dynamic_number_of_consumer_threads_expo_key");
                    return this.A0N.getBoolean("ab_props:job_manager_use_dynamic_number_of_consumer_threads", true);
                case 421:
                    A0B("ab_props:clear_chat_delete_media_files_in_parallel_expo_key");
                    return this.A0N.getBoolean("ab_props:clear_chat_delete_media_files_in_parallel", true);
                case 422:
                    A0B("ab_props:software_transcoder_as_last_resort_expo_key");
                    return this.A0N.getBoolean("ab_props:software_transcoder_as_last_resort", false);
                case 423:
                    A0B("ab_props:payments_upi_new_invite_flow_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:payments_upi_new_invite_flow_enabled", false);
                case 424:
                    A0B("ab_props:db_migration_consistency_check_daily_expo_key");
                    return this.A0N.getBoolean("ab_props:db_migration_consistency_check_daily", false);
                case 425:
                    A0B("ab_props:db_migration_consistency_check_startup_expo_key");
                    return this.A0N.getBoolean("ab_props:db_migration_consistency_check_startup", false);
                case 427:
                    A0B("ab_props:smb_cart_interstitial_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:smb_cart_interstitial_enabled", false);
                case 428:
                    A0B("ab_props:sad_rate_attribution_scorecard_logging_expo_key");
                    return this.A0N.getBoolean("ab_props:sad_rate_attribution_scorecard_logging", false);
                case 430:
                    A0B("ab_props:serializable_migration_me_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:serializable_migration_me_enabled", false);
                case 432:
                    A0B("ab_props:ephemeral_allow_group_members_expo_key");
                    return this.A0N.getBoolean("ab_props:ephemeral_allow_group_members", false);
                case 433:
                    A0B("ab_props:is_user_under_epd_jurisdiction_expo_key");
                    return this.A0N.getBoolean("ab_props:is_user_under_epd_jurisdiction", true);
                case 438:
                    A0B("ab_props:quoted_order_message_tables_v2_migration_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:quoted_order_message_tables_v2_migration_enabled", false);
                case 439:
                    A0B("ab_props:conversation_warming_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:conversation_warming_enabled", false);
                case 440:
                    A0B("ab_props:ptt_playback_speed_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:ptt_playback_speed_enabled", false);
                case 441:
                    A0B("ab_props:android_muted_group_chats_for_message_expo_key");
                    return this.A0N.getBoolean("ab_props:android_muted_group_chats_for_message", false);
                case 442:
                    A0B("ab_props:async_conversationlist_loading_expo_key");
                    return this.A0N.getBoolean("ab_props:async_conversationlist_loading", false);
                case 443:
                    A0B("ab_props:ptt_fast_lock_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:ptt_fast_lock_enabled", false);
                case 444:
                    A0B("ab_props:wam_test_bool_expo_key");
                    return this.A0N.getBoolean("ab_props:wam_test_bool", false);
                case 445:
                    A0B("ab_props:ptt_reduce_recording_delay_expo_key");
                    return this.A0N.getBoolean("ab_props:ptt_reduce_recording_delay", false);
                case 447:
                    A0B("ab_props:sticker_database_migration_expo_key");
                    return this.A0N.getBoolean("ab_props:sticker_database_migration", false);
                case 448:
                    A0B("ab_props:voip_stack_call_timer_expo_key");
                    return this.A0N.getBoolean("ab_props:voip_stack_call_timer", false);
                case 449:
                    A0B("ab_props:call_sharecontactutil_onactivityresult_expo_key");
                    return this.A0N.getBoolean("ab_props:call_sharecontactutil_onactivityresult", true);
                case 450:
                    A0B("ab_props:proj_waldo_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:proj_waldo_enabled", false);
                case 451:
                    A0B("ab_props:smb_collections_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:smb_collections_enabled", false);
                case 452:
                    A0B("ab_props:ephemeral_animation_expo_key");
                    return this.A0N.getBoolean("ab_props:ephemeral_animation", false);
                case 453:
                    A0B("ab_props:proj_ctwa_jid_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:proj_ctwa_jid_enabled", false);
                case 454:
                    A0B("ab_props:new_backup_format_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:new_backup_format_enabled", false);
                case 455:
                    A0B("ab_props:enable_biz_activity_report_request_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_biz_activity_report_request", false);
                case 461:
                    A0B("ab_props:smb_better_catalog_list_adapters_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:smb_better_catalog_list_adapters_enabled", false);
                case 462:
                    A0B("ab_props:list_ui_refresh_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:list_ui_refresh_enabled", false);
                case 465:
                    A0B("ab_props:chat_export_v2_expo_key");
                    return this.A0N.getBoolean("ab_props:chat_export_v2", false);
                case 467:
                    A0B("ab_props:qpl_use_string_sampling_config_expo_key");
                    return this.A0N.getBoolean("ab_props:qpl_use_string_sampling_config", false);
                case 468:
                    A0B("ab_props:upload_fs_in_group_call_expo_key");
                    return this.A0N.getBoolean("ab_props:upload_fs_in_group_call", false);
                case 469:
                    A0B("ab_props:customized_nux_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:customized_nux_enabled", false);
                case 470:
                    A0B("ab_props:business_profile_refresh_m1_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:business_profile_refresh_m1_enabled", false);
                case 472:
                    A0B("ab_props:smb_project_waldo_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:smb_project_waldo_enabled", false);
                case 473:
                    A0B("ab_props:quoted_ui_elements_reply_message_migration_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:quoted_ui_elements_reply_message_migration_enabled", false);
                case 474:
                    A0B("ab_props:youtube_inline_ui_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:youtube_inline_ui_enabled", false);
                case 475:
                    A0B("ab_props:limit_RMR_expo_key");
                    return this.A0N.getBoolean("ab_props:limit_RMR", false);
                case 476:
                    A0B("ab_props:job_manager_enable_deterministic_job_selection_expo_key");
                    return this.A0N.getBoolean("ab_props:job_manager_enable_deterministic_job_selection", true);
                case 478:
                    A0B("ab_props:serial_executor_send_message_methods_expo_key");
                    return this.A0N.getBoolean("ab_props:serial_executor_send_message_methods", false);
                case 479:
                    A0B("ab_props:status_sticker_search_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:status_sticker_search_enabled", false);
                case 480:
                    A0B("ab_props:remove_auth_token_download_expo_key");
                    return this.A0N.getBoolean("ab_props:remove_auth_token_download", false);
                case 481:
                    A0B("ab_props:android_privatestats_endpoint_dit_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:android_privatestats_endpoint_dit_enabled", false);
                case 482:
                    A0B("ab_props:android_linked_devices_re_auth_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:android_linked_devices_re_auth_enabled", false);
                case 484:
                    A0B("ab_props:payments_onboarding_banner_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:payments_onboarding_banner_enabled", false);
                case 487:
                    A0B("ab_props:upload_host_switching_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:upload_host_switching_enabled", false);
                case 488:
                    A0B("ab_props:download_host_switching_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:download_host_switching_enabled", false);
                case 495:
                    A0B("ab_props:md_force_web_upgrade_expo_key");
                    return this.A0N.getBoolean("ab_props:md_force_web_upgrade", false);
                case 496:
                    A0B("ab_props:send_deeplink_jid_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:send_deeplink_jid_enabled", false);
                case 498:
                    A0B("ab_props:delete_chat_clear_chat_dialog_unified_expo_key");
                    return this.A0N.getBoolean("ab_props:delete_chat_clear_chat_dialog_unified", false);
                case 499:
                    A0B("ab_props:report_network_data_usage_event_expo_key");
                    return this.A0N.getBoolean("ab_props:report_network_data_usage_event", false);
                case 500:
                    A0B("ab_props:android_dev_prop_boolean_expo_key");
                    return this.A0N.getBoolean("ab_props:android_dev_prop_boolean", false);
                case 503:
                    A0B("ab_props:oppo_android_11_badging_fix_expo_key");
                    return this.A0N.getBoolean("ab_props:oppo_android_11_badging_fix", false);
                case 504:
                    A0B("ab_props:green_alert_setting_deep_links_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:green_alert_setting_deep_links_enabled", false);
                case 505:
                    A0B("ab_props:serializable_migration_batch_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:serializable_migration_batch_enabled", false);
                case 506:
                    A0B("ab_props:offline_enable_registration_funnel_logging_expo_key");
                    return this.A0N.getBoolean("ab_props:offline_enable_registration_funnel_logging", false);
                case 508:
                    A0B("ab_props:entry_point_conversion_logging_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:entry_point_conversion_logging_enabled", false);
                case 509:
                    A0B("ab_props:disable_novi_hub_nfm_expo_key");
                    return this.A0N.getBoolean("ab_props:disable_novi_hub_nfm", false);
                case 512:
                    A0B("ab_props:use_experimental_expo_keys_expo_key");
                    return this.A0N.getBoolean("ab_props:use_experimental_expo_keys", false);
                case 516:
                    A0B("ab_props:payments_upi_onboarding_phase_one_flow_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:payments_upi_onboarding_phase_one_flow_enabled", false);
                case 519:
                    A0B("ab_props:conversation_row_link_preview_v2_send_expo_key");
                    return this.A0N.getBoolean("ab_props:conversation_row_link_preview_v2_send", false);
                case 520:
                    A0B("ab_props:ctwa_voip_calls_logging_enabled_expo_key");
                    return this.A0N.getBoolean("ab_props:ctwa_voip_calls_logging_enabled", false);
                case 521:
                    A0B("ab_props:enable_send_message_proactive_prekeys_fetch_expo_key");
                    return this.A0N.getBoolean("ab_props:enable_send_message_proactive_prekeys_fetch", false);
                case 523:
                    A0B("ab_props:delay_external_dir_initialization_expo_key");
                    return this.A0N.getBoolean("ab_props:delay_external_dir_initialization", false);
                default:
                    switch (i) {
                        case 95:
                            A0B("ab_props:offline_aa_test_config_expo_key");
                            return this.A0N.getBoolean("ab_props:offline_aa_test_config", false);
                        case 96:
                            A0B("ab_props:offline_aa_test_config_v2_expo_key");
                            return this.A0N.getBoolean("ab_props:offline_aa_test_config_v2", false);
                        case 97:
                            A0B("ab_props:stream_progressive_jpeg_enabled_expo_key");
                            return this.A0N.getBoolean("ab_props:stream_progressive_jpeg_enabled", false);
                        case 98:
                            A0B("ab_props:liger_enabled_expo_key");
                            return this.A0N.getBoolean("ab_props:liger_enabled", false);
                        case 99:
                            A0B("ab_props:liger_quic_enabled_expo_key");
                            return this.A0N.getBoolean("ab_props:liger_quic_enabled", false);
                        default:
                            switch (i) {
                                case 101:
                                    A0B("ab_props:mms4_pps_download_thumbnail_expo_key");
                                    return this.A0N.getBoolean("ab_props:mms4_pps_download_thumbnail", false);
                                case 102:
                                    A0B("ab_props:mms4_pps_download_full_size_expo_key");
                                    return this.A0N.getBoolean("ab_props:mms4_pps_download_full_size", false);
                                case 103:
                                    A0B("ab_props:pjeg_data_saver_enabled_expo_key");
                                    return this.A0N.getBoolean("ab_props:pjeg_data_saver_enabled", false);
                                default:
                                    switch (i) {
                                        case 120:
                                            A0B("ab_props:status_collapse_muted_expo_key");
                                            return this.A0N.getBoolean("ab_props:status_collapse_muted", false);
                                        case 121:
                                            A0B("ab_props:photo_upload_bandwidth_estimation_enabled_expo_key");
                                            return this.A0N.getBoolean("ab_props:photo_upload_bandwidth_estimation_enabled", false);
                                        case 122:
                                            A0B("ab_props:photo_download_bandwidth_estimation_enabled_expo_key");
                                            return this.A0N.getBoolean("ab_props:photo_download_bandwidth_estimation_enabled", false);
                                        case 123:
                                            A0B("ab_props:pjpeg_force_download_mid_quality_enabled_expo_key");
                                            return this.A0N.getBoolean("ab_props:pjpeg_force_download_mid_quality_enabled", false);
                                        case 124:
                                            A0B("ab_props:dns_over_https_enabled_expo_key");
                                            return this.A0N.getBoolean("ab_props:dns_over_https_enabled", false);
                                        case 125:
                                            A0B("ab_props:camera_core_integration_enabled_expo_key");
                                            return this.A0N.getBoolean("ab_props:camera_core_integration_enabled", false);
                                        default:
                                            switch (i) {
                                                case 131:
                                                    A0B("ab_props:photo_download_realtime_bandwidth_enabled_expo_key");
                                                    return this.A0N.getBoolean("ab_props:photo_download_realtime_bandwidth_enabled", false);
                                                case 132:
                                                    A0B("ab_props:wamsys_registration_enabled_expo_key");
                                                    return this.A0N.getBoolean("ab_props:wamsys_registration_enabled", false);
                                                case 133:
                                                    A0B("ab_props:dns_over_https_interleave_enabled_expo_key");
                                                    return this.A0N.getBoolean("ab_props:dns_over_https_interleave_enabled", false);
                                                default:
                                                    switch (i) {
                                                        case 147:
                                                            A0B("ab_props:wamsys_mms_enabled_expo_key");
                                                            return this.A0N.getBoolean("ab_props:wamsys_mms_enabled", false);
                                                        case 148:
                                                            A0B("ab_props:wamsys_registration_v6_enabled_expo_key");
                                                            return this.A0N.getBoolean("ab_props:wamsys_registration_v6_enabled", false);
                                                        case 149:
                                                            A0B("ab_props:mms_media_conn_persist_enabled_expo_key");
                                                            return this.A0N.getBoolean("ab_props:mms_media_conn_persist_enabled", false);
                                                        case 150:
                                                            A0B("ab_props:mms_media_conn_foreground_only_enabled_expo_key");
                                                            return this.A0N.getBoolean("ab_props:mms_media_conn_foreground_only_enabled", false);
                                                        default:
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("unrecognized field with code ");
                                                            sb.append(i);
                                                            throw new IllegalArgumentException(sb.toString());
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            A0B("ab_props:smb_profile_banner_prioritized_enabled_expo_key");
            return this.A0N.getBoolean("ab_props:smb_profile_banner_prioritized_enabled", true);
        }
    }

    public synchronized boolean A0D(int i) {
        if (i == 58) {
            return this.A0N.contains("ab_props:watls_no_dns");
        } else if (i == 59) {
            return this.A0N.contains("ab_props:watls_prefer_ip6");
        } else if (i == 71) {
            return this.A0N.contains("ab_props:offline_text_color_change");
        } else if (i == 72) {
            return this.A0N.contains("ab_props:mms_tcp_congestion_bbr");
        } else if (i == 109) {
            return this.A0N.contains("ab_props:pjpeg_status_data_saver_enabled");
        } else if (i == 110) {
            return this.A0N.contains("ab_props:pjpeg_chat_data_saver_enabled");
        } else if (i == 158) {
            return this.A0N.contains("ab_props:smb_profile_banner_new_copy_enabled");
        } else if (i != 159) {
            switch (i) {
                case 15:
                    return this.A0N.contains("ab_props:disable_prewarm");
                case 24:
                    return this.A0N.contains("ab_props:progressive_jpeg_thumbnail_enabled");
                case 37:
                    return this.A0N.contains("ab_props:new_business_profile_info_view_enabled");
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                    return this.A0N.contains("ab_props:reusable_video_player_enabled");
                case 48:
                    return this.A0N.contains("ab_props:watls_enabled");
                case 56:
                    return this.A0N.contains("ab_props:status_ranking");
                case 65:
                    return this.A0N.contains("ab_props:watls_early_data");
                case 75:
                    return this.A0N.contains("ab_props:whats_my_number_enabled");
                case 77:
                    return this.A0N.contains("ab_props:consumer_reg_profile_design");
                case 79:
                    return this.A0N.contains("ab_props:status_fast_streaming_enable_test");
                case 91:
                    return this.A0N.contains("ab_props:sms_retriever_first");
                case 118:
                    return this.A0N.contains("ab_props:new_wam_runtime_enabled");
                case 128:
                    return this.A0N.contains("ab_props:lazy_camera_view_inflation");
                case 138:
                    return this.A0N.contains("ab_props:disable_status_autodownload_inactive_users");
                case 140:
                    return this.A0N.contains("ab_props:wamsys_registration_v3_enabled");
                case 143:
                    return this.A0N.contains("ab_props:wamsys_registration_v4_enabled");
                case 145:
                    return this.A0N.contains("ab_props:wamsys_registration_v5_enabled");
                case 152:
                    return this.A0N.contains("ab_props:connect_with_friends_dialog_enabled");
                case 154:
                    return this.A0N.contains("ab_props:bandwidth_estimation_adjacent_hours_optimization");
                case 161:
                    return this.A0N.contains("ab_props:work_manager_hourly_cron");
                case 170:
                    return this.A0N.contains("ab_props:work_manager_ntp_sync");
                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                    return this.A0N.contains("ab_props:voip_fix_converter_memory_leak");
                case 177:
                    return this.A0N.contains("ab_props:camelot");
                case 178:
                    return this.A0N.contains("ab_props:roundtable");
                case 179:
                    return this.A0N.contains("ab_props:room_messenger_upgrade");
                case 180:
                    return this.A0N.contains("ab_props:enable_non_wake_up_alarm_ping");
                case 181:
                    return this.A0N.contains("ab_props:async_init_after_thread_idle");
                case 182:
                    return this.A0N.contains("ab_props:wamsys_decryption_individual_enabled");
                case 187:
                    return this.A0N.contains("ab_props:wamsys_encryption_individual_enabled");
                case 188:
                    return this.A0N.contains("ab_props:wamsys_decryption_group_enabled");
                case 189:
                    return this.A0N.contains("ab_props:wamsys_encryption_group_enabled");
                case 190:
                    return this.A0N.contains("ab_props:transsion_badging");
                case 196:
                    return this.A0N.contains("ab_props:async_data_load_on_startup");
                case 198:
                    return this.A0N.contains("ab_props:bloks_use_minscript_android");
                case 199:
                    return this.A0N.contains("ab_props:load_chats_lazily");
                case 201:
                    return this.A0N.contains("ab_props:db_migration_low_latency_kill_switch");
                case 211:
                    return this.A0N.contains("ab_props:wallpapers_v2");
                case 212:
                    return this.A0N.contains("ab_props:qpl_enabled");
                case 227:
                    return this.A0N.contains("ab_props:video_transcode_retry_enabled");
                case 228:
                    return this.A0N.contains("ab_props:video_transcode_fallback_enabled");
                case 229:
                    return this.A0N.contains("ab_props:dedupe_transcode_images");
                case 230:
                    return this.A0N.contains("ab_props:dedupe_transcode_videos");
                case 231:
                    return this.A0N.contains("ab_props:dedupe_transcode_gif");
                case 232:
                    return this.A0N.contains("ab_props:dedupe_transcode_audio");
                case 233:
                    return this.A0N.contains("ab_props:in_app_support_v2_enabled");
                case 234:
                    return this.A0N.contains("ab_props:disable_new_sticker_animation");
                case 235:
                    return this.A0N.contains("ab_props:enable_mmap_stringpacks");
                case 237:
                    return this.A0N.contains("ab_props:new_sticker_animation_behavior_v2");
                case 238:
                    return this.A0N.contains("ab_props:disable_privatestats_battery");
                case 239:
                    return this.A0N.contains("ab_props:remove_geolocation_videos");
                case 240:
                    return this.A0N.contains("ab_props:sticker_search_enabled");
                case 241:
                    return this.A0N.contains("ab_props:enable_privatestats");
                case 246:
                    return this.A0N.contains("ab_props:upload_status_thumb_mms_enabled");
                case 247:
                    return this.A0N.contains("ab_props:upload_document_thumb_mms_enabled");
                case 248:
                    return this.A0N.contains("ab_props:upload_link_thumb_mms_enabled");
                case 249:
                    return this.A0N.contains("ab_props:download_status_thumb_mms_enabled");
                case 250:
                    return this.A0N.contains("ab_props:download_document_thumb_mms_enabled");
                case 251:
                    return this.A0N.contains("ab_props:download_link_thumb_mms_enabled");
                case 252:
                    return this.A0N.contains("ab_props:send_status_thumb_in_message_disabled");
                case 253:
                    return this.A0N.contains("ab_props:send_document_thumb_in_message_disabled");
                case 254:
                    return this.A0N.contains("ab_props:send_link_thumb_in_message_disabled");
                case 255:
                    return this.A0N.contains("ab_props:animated_stickers_thread_clean_up");
                case 256:
                    return this.A0N.contains("ab_props:media_upload_aggressive_retry_enabled");
                case 257:
                    return this.A0N.contains("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled");
                case 259:
                    return this.A0N.contains("ab_props:enable_catalogs_carts");
                case 263:
                    return this.A0N.contains("ab_props:dedupe_transcode_shared_images");
                case 264:
                    return this.A0N.contains("ab_props:dedupe_transcode_shared_videos");
                case 266:
                    return this.A0N.contains("ab_props:app_locked_with_biometrics");
                case 267:
                    return this.A0N.contains("ab_props:shops_storefront_native_entrypoint_enabled");
                case 270:
                    return this.A0N.contains("ab_props:android_media_use_fresco_for_gifs");
                case 271:
                    return this.A0N.contains("ab_props:sticker_tray_animation_finite_loops");
                case 272:
                    return this.A0N.contains("ab_props:sticker_tray_animation_first_row");
                case 273:
                    return this.A0N.contains("ab_props:sticker_tray_animation_fully_visible_items");
                case 274:
                    return this.A0N.contains("ab_props:pen_smoothing_enabled");
                case 276:
                    return this.A0N.contains("ab_props:sticker_picker_animated_sticker_shrinking");
                case 278:
                    return this.A0N.contains("ab_props:status_grid_enabled");
                case 279:
                    return this.A0N.contains("ab_props:pencil_ui_enhancements_wave_1_enabled");
                case 280:
                    return this.A0N.contains("ab_props:android_push_notify_fg_service");
                case 281:
                    return this.A0N.contains("ab_props:enable_long_running_job_monitor");
                case 283:
                    return this.A0N.contains("ab_props:android_push_config_muted_chats");
                case 290:
                    return this.A0N.contains("ab_props:third_party_animated_sticker_import");
                case 291:
                    return this.A0N.contains("ab_props:sticker_contextual_suggestion_enabled");
                case 292:
                    return this.A0N.contains("ab_props:android_us_language_selector");
                case 295:
                    return this.A0N.contains("ab_props:disable_third_party_animated_sticker_animation");
                case 296:
                    return this.A0N.contains("ab_props:stanza_processing_logging_enabled");
                case 297:
                    return this.A0N.contains("ab_props:edit_business_profile_new_mode_enabled");
                case 306:
                    return this.A0N.contains("ab_props:smb_better_catalog_upload_enabled");
                case 307:
                    return this.A0N.contains("ab_props:payments_bloks_rendercore_enabled");
                case 308:
                    return this.A0N.contains("ab_props:groups_dogfooding_ui");
                case 309:
                    return this.A0N.contains("ab_props:md_icdc_enabled");
                case 311:
                    return this.A0N.contains("ab_props:watls_enable_early_data_http_post");
                case 312:
                    return this.A0N.contains("ab_props:watls_enable_early_data_http_get");
                case 314:
                    return this.A0N.contains("ab_props:yt_video_preview");
                case 315:
                    return this.A0N.contains("ab_props:stop_abprops_traffic_in_serverprops_response");
                case 316:
                    return this.A0N.contains("ab_props:disable_buttons_message");
                case 325:
                    return this.A0N.contains("ab_props:mute_video");
                case 332:
                    return this.A0N.contains("ab_props:new_user_location_dialogs_enabled");
                case 334:
                    return this.A0N.contains("ab_props:use_compressed_packfile");
                case 340:
                    return this.A0N.contains("ab_props:updated_business_registration_flow_enabled");
                case 341:
                    return this.A0N.contains("ab_props:keyboard_popup_in_registration_disabled");
                case 344:
                    return this.A0N.contains("ab_props:green_alert");
                case 349:
                    return this.A0N.contains("ab_props:qr_scanner_view_v2_enabled");
                case 355:
                    return this.A0N.contains("ab_props:shops_storefront_icon_and_preview_entrypoints_enabled");
                case 360:
                    return this.A0N.contains("ab_props:enable_cart_v1_1_business_actions");
                case 361:
                    return this.A0N.contains("ab_props:played_self_enabled");
                case 362:
                    return this.A0N.contains("ab_props:android_button_message_killswitch");
                case 363:
                    return this.A0N.contains("ab_props:important_messages");
                case 364:
                    return this.A0N.contains("ab_props:cart_v1_1_order_message_changes_enabled");
                case 366:
                    return this.A0N.contains("ab_props:user_notice_clear");
                case 367:
                    return this.A0N.contains("ab_props:calls_row_constraint_layout");
                case 369:
                    return this.A0N.contains("ab_props:product_catalog_hide_show_items_enabled");
                case 370:
                    return this.A0N.contains("ab_props:sticker_pack_deeplink_enabled");
                case 372:
                    return this.A0N.contains("ab_props:media_caption_ui_v2");
                case 373:
                    return this.A0N.contains("ab_props:bsp_receipt");
                case 377:
                    return this.A0N.contains("ab_props:android_key_store_recover_pwd_key");
                case 378:
                    return this.A0N.contains("ab_props:android_key_store_delete_pwd_key");
                case 381:
                    return this.A0N.contains("ab_props:catalog_cart_on_off_enabled");
                case 382:
                    return this.A0N.contains("ab_props:ephemeral_media_private");
                case 385:
                    return this.A0N.contains("ab_props:android_product_list_killswitch");
                case 386:
                    return this.A0N.contains("ab_props:enable_cup_phone");
                case 387:
                    return this.A0N.contains("ab_props:new_invite_flow");
                case 391:
                    return this.A0N.contains("ab_props:conversation_async_view_inflation_enabled");
                case 394:
                    return this.A0N.contains("ab_props:report_disk_event");
                case 395:
                    return this.A0N.contains("ab_props:quoted_order_message_tables_migration_enabled");
                case 397:
                    return this.A0N.contains("ab_props:qpl_listeners_enabled");
                case 399:
                    return this.A0N.contains("ab_props:android_hourly_cron_via_privatestats");
                case 400:
                    return this.A0N.contains("ab_props:conversation_media_preview_v2");
                case 401:
                    return this.A0N.contains("ab_props:save_capture_internal");
                case 403:
                    return this.A0N.contains("ab_props:serializable_migration_statistics_enabled");
                case 407:
                    return this.A0N.contains("ab_props:ephemeral_24h_duration");
                case 412:
                    return this.A0N.contains("ab_props:suspicious_chats_privacy_upsell_banner");
                case 413:
                    return this.A0N.contains("ab_props:lwi_v1_ad_promotion_on_fb_enabled");
                case 418:
                    return this.A0N.contains("ab_props:job_manager_use_dynamic_number_of_consumer_threads");
                case 421:
                    return this.A0N.contains("ab_props:clear_chat_delete_media_files_in_parallel");
                case 422:
                    return this.A0N.contains("ab_props:software_transcoder_as_last_resort");
                case 423:
                    return this.A0N.contains("ab_props:payments_upi_new_invite_flow_enabled");
                case 424:
                    return this.A0N.contains("ab_props:db_migration_consistency_check_daily");
                case 425:
                    return this.A0N.contains("ab_props:db_migration_consistency_check_startup");
                case 427:
                    return this.A0N.contains("ab_props:smb_cart_interstitial_enabled");
                case 428:
                    return this.A0N.contains("ab_props:sad_rate_attribution_scorecard_logging");
                case 430:
                    return this.A0N.contains("ab_props:serializable_migration_me_enabled");
                case 432:
                    return this.A0N.contains("ab_props:ephemeral_allow_group_members");
                case 433:
                    return this.A0N.contains("ab_props:is_user_under_epd_jurisdiction");
                case 438:
                    return this.A0N.contains("ab_props:quoted_order_message_tables_v2_migration_enabled");
                case 439:
                    return this.A0N.contains("ab_props:conversation_warming_enabled");
                case 440:
                    return this.A0N.contains("ab_props:ptt_playback_speed_enabled");
                case 441:
                    return this.A0N.contains("ab_props:android_muted_group_chats_for_message");
                case 442:
                    return this.A0N.contains("ab_props:async_conversationlist_loading");
                case 443:
                    return this.A0N.contains("ab_props:ptt_fast_lock_enabled");
                case 444:
                    return this.A0N.contains("ab_props:wam_test_bool");
                case 445:
                    return this.A0N.contains("ab_props:ptt_reduce_recording_delay");
                case 447:
                    return this.A0N.contains("ab_props:sticker_database_migration");
                case 448:
                    return this.A0N.contains("ab_props:voip_stack_call_timer");
                case 449:
                    return this.A0N.contains("ab_props:call_sharecontactutil_onactivityresult");
                case 450:
                    return this.A0N.contains("ab_props:proj_waldo_enabled");
                case 451:
                    return this.A0N.contains("ab_props:smb_collections_enabled");
                case 452:
                    return this.A0N.contains("ab_props:ephemeral_animation");
                case 453:
                    return this.A0N.contains("ab_props:proj_ctwa_jid_enabled");
                case 454:
                    return this.A0N.contains("ab_props:new_backup_format_enabled");
                case 455:
                    return this.A0N.contains("ab_props:enable_biz_activity_report_request");
                case 461:
                    return this.A0N.contains("ab_props:smb_better_catalog_list_adapters_enabled");
                case 462:
                    return this.A0N.contains("ab_props:list_ui_refresh_enabled");
                case 465:
                    return this.A0N.contains("ab_props:chat_export_v2");
                case 467:
                    return this.A0N.contains("ab_props:qpl_use_string_sampling_config");
                case 468:
                    return this.A0N.contains("ab_props:upload_fs_in_group_call");
                case 469:
                    return this.A0N.contains("ab_props:customized_nux_enabled");
                case 470:
                    return this.A0N.contains("ab_props:business_profile_refresh_m1_enabled");
                case 472:
                    return this.A0N.contains("ab_props:smb_project_waldo_enabled");
                case 473:
                    return this.A0N.contains("ab_props:quoted_ui_elements_reply_message_migration_enabled");
                case 474:
                    return this.A0N.contains("ab_props:youtube_inline_ui_enabled");
                case 475:
                    return this.A0N.contains("ab_props:limit_RMR");
                case 476:
                    return this.A0N.contains("ab_props:job_manager_enable_deterministic_job_selection");
                case 478:
                    return this.A0N.contains("ab_props:serial_executor_send_message_methods");
                case 479:
                    return this.A0N.contains("ab_props:status_sticker_search_enabled");
                case 480:
                    return this.A0N.contains("ab_props:remove_auth_token_download");
                case 481:
                    return this.A0N.contains("ab_props:android_privatestats_endpoint_dit_enabled");
                case 482:
                    return this.A0N.contains("ab_props:android_linked_devices_re_auth_enabled");
                case 484:
                    return this.A0N.contains("ab_props:payments_onboarding_banner_enabled");
                case 487:
                    return this.A0N.contains("ab_props:upload_host_switching_enabled");
                case 488:
                    return this.A0N.contains("ab_props:download_host_switching_enabled");
                case 495:
                    return this.A0N.contains("ab_props:md_force_web_upgrade");
                case 496:
                    return this.A0N.contains("ab_props:send_deeplink_jid_enabled");
                case 498:
                    return this.A0N.contains("ab_props:delete_chat_clear_chat_dialog_unified");
                case 499:
                    return this.A0N.contains("ab_props:report_network_data_usage_event");
                case 500:
                    return this.A0N.contains("ab_props:android_dev_prop_boolean");
                case 503:
                    return this.A0N.contains("ab_props:oppo_android_11_badging_fix");
                case 504:
                    return this.A0N.contains("ab_props:green_alert_setting_deep_links_enabled");
                case 505:
                    return this.A0N.contains("ab_props:serializable_migration_batch_enabled");
                case 506:
                    return this.A0N.contains("ab_props:offline_enable_registration_funnel_logging");
                case 508:
                    return this.A0N.contains("ab_props:entry_point_conversion_logging_enabled");
                case 509:
                    return this.A0N.contains("ab_props:disable_novi_hub_nfm");
                case 512:
                    return this.A0N.contains("ab_props:use_experimental_expo_keys");
                case 516:
                    return this.A0N.contains("ab_props:payments_upi_onboarding_phase_one_flow_enabled");
                case 519:
                    return this.A0N.contains("ab_props:conversation_row_link_preview_v2_send");
                case 520:
                    return this.A0N.contains("ab_props:ctwa_voip_calls_logging_enabled");
                case 521:
                    return this.A0N.contains("ab_props:enable_send_message_proactive_prekeys_fetch");
                case 523:
                    return this.A0N.contains("ab_props:delay_external_dir_initialization");
                default:
                    switch (i) {
                        case 95:
                            return this.A0N.contains("ab_props:offline_aa_test_config");
                        case 96:
                            return this.A0N.contains("ab_props:offline_aa_test_config_v2");
                        case 97:
                            return this.A0N.contains("ab_props:stream_progressive_jpeg_enabled");
                        case 98:
                            return this.A0N.contains("ab_props:liger_enabled");
                        case 99:
                            return this.A0N.contains("ab_props:liger_quic_enabled");
                        default:
                            switch (i) {
                                case 101:
                                    return this.A0N.contains("ab_props:mms4_pps_download_thumbnail");
                                case 102:
                                    return this.A0N.contains("ab_props:mms4_pps_download_full_size");
                                case 103:
                                    return this.A0N.contains("ab_props:pjeg_data_saver_enabled");
                                default:
                                    switch (i) {
                                        case 120:
                                            return this.A0N.contains("ab_props:status_collapse_muted");
                                        case 121:
                                            return this.A0N.contains("ab_props:photo_upload_bandwidth_estimation_enabled");
                                        case 122:
                                            return this.A0N.contains("ab_props:photo_download_bandwidth_estimation_enabled");
                                        case 123:
                                            return this.A0N.contains("ab_props:pjpeg_force_download_mid_quality_enabled");
                                        case 124:
                                            return this.A0N.contains("ab_props:dns_over_https_enabled");
                                        case 125:
                                            return this.A0N.contains("ab_props:camera_core_integration_enabled");
                                        default:
                                            switch (i) {
                                                case 131:
                                                    return this.A0N.contains("ab_props:photo_download_realtime_bandwidth_enabled");
                                                case 132:
                                                    return this.A0N.contains("ab_props:wamsys_registration_enabled");
                                                case 133:
                                                    return this.A0N.contains("ab_props:dns_over_https_interleave_enabled");
                                                default:
                                                    switch (i) {
                                                        case 147:
                                                            return this.A0N.contains("ab_props:wamsys_mms_enabled");
                                                        case 148:
                                                            return this.A0N.contains("ab_props:wamsys_registration_v6_enabled");
                                                        case 149:
                                                            return this.A0N.contains("ab_props:mms_media_conn_persist_enabled");
                                                        case 150:
                                                            return this.A0N.contains("ab_props:mms_media_conn_foreground_only_enabled");
                                                        default:
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("unrecognized field with code ");
                                                            sb.append(i);
                                                            throw new IllegalArgumentException(sb.toString());
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            return this.A0N.contains("ab_props:smb_profile_banner_prioritized_enabled");
        }
    }
}
