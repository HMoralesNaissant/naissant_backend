ALTER TABLE public.disp_conveyor RENAME TO disp_carrier;
ALTER TABLE public.disp_conveyor_accounts RENAME TO disp_carrier_accounts;

ALTER TABLE public.disp_carrier_accounts
    RENAME COLUMN id_conveyor TO id_carrier;

ALTER TABLE public.disp_dispatchs_labels
    RENAME COLUMN id_conveyor TO id_carrier;
ALTER TABLE public.disp_dispatchs_labels
    RENAME COLUMN id_conveyor_acc TO id_carrier_acc;

ALTER TABLE public.disp_dispatch_labels_response
    RENAME COLUMN id_conveyor TO id_carrier;
