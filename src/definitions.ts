export interface PictureInPicturePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
