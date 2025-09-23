export interface PictureInPicturePlugin {
  isPiPAvailable(): Promise<IStatus>;

  startPiPMode(options?: { aspectRatio?: IRatio }): Promise<{ success: boolean }>;  
}

export interface IRatio {
  height  : number;
  width   : number;
}

export interface IStatus {
  available: boolean;
}